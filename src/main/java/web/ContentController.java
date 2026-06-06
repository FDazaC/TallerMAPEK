package web;

import io.javalin.http.Context;
import knowledge.KnowledgeBase;
import knowledge.PresentationMode;
import mape.Analyzer;
import mape.DemandLevel;
import mape.Executor;
import mape.Monitor;
import mape.Planner;
import service.ContentService;

import java.util.HashMap;
import java.util.Map;

public class ContentController {

    private static final Monitor monitor = new Monitor();
    private static final Analyzer analyzer = new Analyzer();
    private static final Planner planner = new Planner();
    private static final Executor executor = new Executor();
    private static final ContentService contentService = new ContentService();

    public static void getContent(Context ctx) {

        monitor.checkAndRegister();
        DemandLevel demand = analyzer.analyze();
        PresentationMode plan = planner.plan(demand);
        executor.execute(plan);

        model.Content content = contentService.getContent();

        ctx.json(content);
    }

    public static void getStatus(Context ctx) {
        KnowledgeBase kb = KnowledgeBase.getInstance();

        Map<String, Object> statusResponse = new HashMap<>();
        statusResponse.put("mode", kb.getState().getCurrentMode().name());
        statusResponse.put("requests", kb.getState().getRequestCount());
        statusResponse.put("restrictedThreshold", kb.getConfig().getRestrictedThreshold());
        statusResponse.put("textThreshold", kb.getConfig().getTextThreshold());

        ctx.json(statusResponse);
    }

    public static void resetSystem(Context ctx) {
        KnowledgeBase.getInstance().reset();
        ctx.result("Simulación reiniciada: Contador a 0 y sistema en modo MULTIMEDIA.");
    }
}
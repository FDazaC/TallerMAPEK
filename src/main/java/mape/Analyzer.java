package mape;

import knowledge.KnowledgeBase;

public class Analyzer {

    public DemandLevel analyze(){
        KnowledgeBase kb =  KnowledgeBase.getInstance();
        int currentRequests =  kb.getState().getRequestCount();
        int restrictedThreshold = kb.getConfig().getRestrictedThreshold();
        int textThreshold = kb.getConfig().getTextThreshold();

        DemandLevel level;

        if (currentRequests >= textThreshold){
            level = DemandLevel.HIGH;
            System.out.println("[Analyze] Se detectó alta demanda");
        } else if (currentRequests >= restrictedThreshold) {
            level = DemandLevel.MEDIUM;
            System.out.println("[Analyze] Se detectó demanda media");
        }else{
            level = DemandLevel.LOW;
            System.out.println("[Analyze] Se detectó demanda baja");
        }

        return level;
    }
}

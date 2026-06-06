package mape;

import knowledge.KnowledgeBase;
import knowledge.PresentationMode;

public class Executor {

    public void execute(PresentationMode plannedMode){
        KnowledgeBase kb = KnowledgeBase.getInstance();
        PresentationMode currentMode = kb.getState().getCurrentMode();

        if(currentMode != plannedMode){
            kb.getState().setCurrentMode(plannedMode);
            System.out.println("[EXECUTE] El sistema cambio a modo " + plannedMode + ".");
        }
    }

}

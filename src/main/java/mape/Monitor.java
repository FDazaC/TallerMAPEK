package mape;

import knowledge.KnowledgeBase;

public class Monitor {

    public void checkAndRegister() {
        KnowledgeBase kb = KnowledgeBase.getInstance();
        kb.incrementRequest(); //suma uno al contador de peticiones

        System.out.println("[MONITOR] Solicitud se ha registrado. Solicitudes actuales: " + kb.getState().getRequestCount());
    }
}

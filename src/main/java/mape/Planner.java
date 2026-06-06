package mape;

import knowledge.PresentationMode;

public class Planner {
    public PresentationMode plan (DemandLevel demandLevel){
        PresentationMode plannedMode;

        switch (demandLevel) {
            case HIGH:
                plannedMode = PresentationMode.TEXT;
                System.out.println("[PLAN] Activar modo texto.");
                break;
            case MEDIUM:
                plannedMode = PresentationMode.RESTRICTED;
                System.out.println("[PLAN] Activar modo restringido.");
                break;
            case LOW:
            default:
                plannedMode = PresentationMode.MULTIMEDIA;
                System.out.println("[PLAN] Mantener/Activar modo multimedia.");
                break;
        }
        return plannedMode;
    }
}

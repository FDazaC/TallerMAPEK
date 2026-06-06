package knowledge;

public class AdaptationConfig {
    private int restrictedThreshold = 10; //Limite de solicitudes que recibe antes de pasar a modo RESTRICTED
    private int textThreshold = 20; //Limite de solicitudes que recibe antes de pasar a modo TEXT

    public int getRestrictedThreshold() {
        return restrictedThreshold;
    }

    public int getTextThreshold() {
        return textThreshold;
    }
}

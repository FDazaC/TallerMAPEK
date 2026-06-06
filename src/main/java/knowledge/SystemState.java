package knowledge;

public class SystemState {
    private int requestCount = 0;
    private PresentationMode currentMode = PresentationMode.MULTIMEDIA;

    public int getRequestCount() { return requestCount; }
    public void incrementRequestCount() { this.requestCount++; }
    public void resetRequestCount() { this.requestCount = 0; }

    public PresentationMode getCurrentMode() { return currentMode; }
    public void setCurrentMode(PresentationMode currentMode) { this.currentMode = currentMode;}

}

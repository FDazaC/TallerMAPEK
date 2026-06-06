package knowledge;

public class KnowledgeBase {
    private static KnowledgeBase instance;
    private SystemState state;
    private AdaptationConfig config;

    //Para poder tener solo una base de conocimiento se utilizó Singleton
    private KnowledgeBase(){
        this.state = new SystemState();
        this.config = new AdaptationConfig();
    }

    //Se utilizó synchronized para que evitar errores de concurrencia
    public static synchronized KnowledgeBase getInstance(){
        if(instance == null){
            instance = new KnowledgeBase();
        }
        return instance;
    }

    public synchronized void incrementRequest(){
        state.incrementRequestCount();
    }

    public synchronized void reset(){
        state.resetRequestCount();
        state.setCurrentMode(PresentationMode.MULTIMEDIA);
    }

    public SystemState getState() {
        return state;
    }

    public AdaptationConfig getConfig() {
        return config;
    }
}

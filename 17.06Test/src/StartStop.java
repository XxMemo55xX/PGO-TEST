public interface StartStop {
    void start() throws EngineStatusException;
    void stop() throws EngineStatusException;
}

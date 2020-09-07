package replace_type_code_with_state_strategy;

public class Logger {
    private State state;

    public Logger() {
        setState(State.STOPPED);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void start() {
        state.start();
        setState(State.LOGGING);
    }

    public void stop() {
        state.stop();
        setState(State.STOPPED);
    }

    public void log(String info) {
        state.log(info);
    }
}

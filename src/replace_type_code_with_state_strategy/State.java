package replace_type_code_with_state_strategy;

public enum State {
    STOPPED {
        @Override
        public void start() {
            System.out.println("** START LOGGING **");
        }

        @Override
        public void stop() {
            /* 아무것도 하지 않음 */
        }

        @Override
        public void log(String info) {
            System.out.println("Invalid state: " + info);
        }
    },
    LOGGING {
        @Override
        public void start() {
            /* 아무것도 하지 않음 */
        }

        @Override
        public void stop() {
            System.out.println("** STOP LOGGING **");
        }

        @Override
        public void log(String info) {
            System.out.println("Invalid state: " + info);
        }
    };

    public abstract void start();
    public abstract void stop();
    public abstract void log(String info);
}

package replace_error_code_with_exception;

import java.util.HashMap;
import java.util.Map;

public class Command {
    public static final Command FORWARD = new Command("forward");
    public static final Command BACKWARD = new Command("backward");
    public static final Command TURN_RIGHT = new Command("right");
    public static final Command TURN_LEFT = new Command("left");
    private static final Map<String, Command> _commandNameMap = new HashMap<>();

    static {
        _commandNameMap.put(FORWARD.name, FORWARD);
        _commandNameMap.put(BACKWARD.name, BACKWARD);
        _commandNameMap.put(TURN_RIGHT.name, TURN_RIGHT);
        _commandNameMap.put(TURN_LEFT.name, TURN_LEFT);
    }

    private final String name;

    private Command(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Command parseCommand(String name) throws InvalidCommandException {
        if (!_commandNameMap.containsKey(name)) {
            throw new InvalidCommandException(name);
        }
        return _commandNameMap.get(name);
    }
}

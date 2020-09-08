package magic_number;

public class RobotCommand {
    private final String name;

    public RobotCommand(String name) {
        this.name = name;
    }

    public String toString() {
        return "[ RobotCommand: " + name + " ]";
    }
}

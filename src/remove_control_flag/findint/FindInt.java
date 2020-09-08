package remove_control_flag.findint;

public class FindInt {
    public static boolean find(int[] data, int target) {
        for (int datum : data) {
            if (datum == target) {
                return true;
            }
        }
        return false;
    }
}


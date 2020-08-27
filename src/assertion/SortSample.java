package assertion;

public class SortSample {
    private final int[] data;

    public SortSample(int[] data) {
        this.data = new int[data.length];
        System.arraycopy(data, 0, this.data, 0, data.length);
    }

    public void sort() {
        for (int x = 0; x < data.length - 1; x++) {
            int m = x;
            for (int y = x + 1; y < data.length; y++) {
                if (data[m] > data[y]) {
                    m = y;
                }
            }
            assert isMin(m, x, data.length - 1): this + ", x = " + x;
            int v = data[m];
            data[m] = data[x];
            data[x] = v;
            assert isSorted(0, x + 1): this + ", x = " + x;
        }
    }

    private boolean isMin(int pos, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (data[pos] > data[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean isSorted(int start, int end) {
        for (int i = start; i < end; i++) {
            if (data[i] > data[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[ ");
        for (int datum : data) {
            buffer.append(datum);
            buffer.append(", ");
        }
        buffer.append("]");
        return buffer.toString();
    }
}

package replace_constructor_with_factory_method;

public abstract class Shape {
    private final int startx;
    private final int starty;
    private final int endx;
    private final int endy;

    protected Shape(int startx, int starty, int endx, int endy) {
        this.startx = startx;
        this.endx = endx;
        this.starty = starty;
        this.endy = endy;
    }

    public static Shape createLine(int startx, int starty, int endx, int endy) {
        return new ShapeLine(startx, starty, endx, endy);
    }

    public static Shape createRectangle(int startx, int starty, int endx, int endy) {
        return new ShapeRectangle(startx, starty, endx, endy);
    }

    public static Shape createOval(int startx, int starty, int endx, int endy) {
        return new ShapeOval(startx, starty, endx, endy);
    }

    public String toString() {
        return "[ "
                + getName() + ", "
                + "(" + startx + ", " + starty + ")-"
                + "(" + endx + ", " + endy + ") ]";
    }

    public abstract String getName();

    public abstract void draw();
}

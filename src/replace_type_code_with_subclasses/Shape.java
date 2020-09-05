package replace_type_code_with_subclasses;

public abstract class Shape {
    public static final int TYPECODE_LINE = 0;
    public static final int TYPECODE_RECTANGLE = 1;
    public static final int TYPECODE_OVAL = 2;

    private final int startx;
    private final int starty;
    private final int endx;
    private final int endy;

    public static ShapeLine createShapeLine(int startx, int starty, int endx, int endy) {
        return new ShapeLine(startx, starty, endx, endy);
    }

    public static ShapeRectangle createShapeRectangle(int startx, int starty, int endx, int endy) {
        return new ShapeRectangle(startx, starty, endx, endy);
    }

    public static ShapeOval createShapeOval(int startx, int starty, int endx, int endy) {
        return new ShapeOval(startx, starty, endx, endy);
    }


    protected Shape(int startx, int starty, int endx, int endy) {
        this.startx = startx;
        this.endx = endx;
        this.starty = starty;
        this.endy = endy;
    }

    public abstract int getTypecode();

    public abstract String getName();

    public String toString() {
        return "[ "
                + getName() + ", "
                + "(" + startx + ", " + starty + ")-"
                + "(" + endx + ", " + endy + ") ]";
    }

    public abstract void draw();
}

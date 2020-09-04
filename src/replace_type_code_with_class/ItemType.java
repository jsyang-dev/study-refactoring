package replace_type_code_with_class;

public class ItemType {
    public static final ItemType BOOK = new ItemType(0);
    public static final ItemType DVD = new ItemType(1);
    public static final ItemType SOFTWARE = new ItemType(2);

    private int typecode;

    public ItemType(int typecode) {
        this.typecode = typecode;
    }

    public int getTypecode() {
        return typecode;
    }

    public static ItemType getItemType(int typecode) {
        switch (typecode) {
            case 0:
                return BOOK;
            case 1:
                return DVD;
            case 2:
                return SOFTWARE;
            default:
                return null;
        }
    }
}

package replace_type_code_with_class;

public class Item {
    public static final int TYPECODE_BOOK = ItemType.BOOK.getTypecode();
    public static final int TYPECODE_DVD = ItemType.DVD.getTypecode();
    public static final int TYPECODE_SOFTWARE = ItemType.SOFTWARE.getTypecode();

    private final ItemType itemType;
    private final String _title;
    private final int _price;

    public Item(int typecode, String title, int price) {
        itemType = ItemType.getItemType(typecode);
        _title = title;
        _price = price;
    }

    public int getTypecode() { return itemType.getTypecode(); }
    public String getTitle() { return _title; }
    public int getPrice() { return _price; }

    public String toString() {
        return "[ "
            + getTypecode() + ", "
            + getTitle() + ", "
            + getPrice() + " ]";
    }
    // ...
}

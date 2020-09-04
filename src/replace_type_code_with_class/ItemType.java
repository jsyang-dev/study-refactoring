package replace_type_code_with_class;

public enum ItemType {
    BOOK(0), DVD(1), SOFTWARE(2);

    private final int typecode;

    ItemType(int typecode) {
        this.typecode = typecode;
    }

    public int getTypecode() {
        return typecode;
    }
}

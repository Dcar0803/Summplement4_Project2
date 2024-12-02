public class StringArrayHandler {
    private final String[] stringArray;

    /**
     * Constructor to initialize the string array.
     *
     * @param size The size of the string array.
     */
    public StringArrayHandler(int size) {
        this.stringArray = new String[size];
    }

    /**
     * Inserts a string at a specified index using modular arithmetic for overflow.
     *
     * @param value The string to insert.
     * @param index The index to insert at (modular arithmetic will be applied).
     */
    public void insert(String value, int index) {
        int actualIndex = index % stringArray.length;
        stringArray[actualIndex] = value;
    }

    /**
     * Retrieves a string from the specified index.
     *
     * @param index The index to retrieve from.
     * @return The string at the specified index.
     */
    public String get(int index) {
        return stringArray[index];
    }
}

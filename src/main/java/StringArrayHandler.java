
public class StringArrayHandler {
	
	private final String[] stringArray;
	
	public StringArrayHandler(int size) {
        this.stringArray = new String[size];
    }
	
	
	
	public void insert(String value, int index) {
        int actualIndex = index % stringArray.length;
        stringArray[actualIndex] = value;
    }
	
	
	public String get(int index) {
        return stringArray[index];
    }


}

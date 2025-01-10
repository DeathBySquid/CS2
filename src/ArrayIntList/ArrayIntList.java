public class ArrayIntList {
    private static final int DEFAULT_CAPACITY = 5;
    private int[] elementData;
    private int size;

    public ArrayIntList() {
        this.elementData = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public void add(int element) {
        ensureCapacity(size + 1);
        elementData[size] = element;
        size++;
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < size - 1; i++) {
            result += elementData[i] + ", ";
        }
        result += elementData[size - 1] + "]";
        return result;
    }

    public void ensureCapacity(int capacity) {
        if (capacity > elementData.length) {
            int[] newArray = new int[elementData.length*2 + 1];
            for (int i = 0; i < elementData.length; i++) {
                newArray[i] = elementData[i];
            }
            elementData = newArray;
        }
    }
}

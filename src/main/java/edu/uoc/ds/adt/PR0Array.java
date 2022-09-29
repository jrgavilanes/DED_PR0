package edu.uoc.ds.adt;

public class PR0Array {
    private final int[] myArray = new int[50];

    public PR0Array() {
        for (int i = 0; i <= 49; i++) {
            myArray[i] = i * 2;
        }
    }

    public int getIndexOf(int search) {
        for (int i = 0; i <= 49; i++) {
            if (myArray[i] == search) return i;
        }
        return -1;
    }

    public int binarySearch(int search) {
        int low = 0;
        int high = myArray.length - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (search == myArray[mid]) {
                return mid;
            } else if (search > myArray[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        return -1;
    }

    public int[] getArray() {
        return myArray;
    }
}

package Algorithm.Searching;

public class LinearSearch {
    public static void main(String[] args) {

        int array[] = {2, 5, 6, 9};
        int x = 2;
        int result = search(array, x);
        if (result == -1) {
            System.out.println("Element Not present " + result);
        } else {
            System.out.println("Element present " + result);
        }

    }

    private static int search(int searchArray[], int search) {
        int size = searchArray.length;
        for (int i = 0; i < size; i++) {
            if (searchArray[i] == search)
                return search;
        }

        return -1;
    }
}

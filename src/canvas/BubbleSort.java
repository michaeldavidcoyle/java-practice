package canvas;// bubble sort
// basic (not very efficient sorting algorithm
// sort quantities from least to greatest
// compares adjacent elements and pushes higher quantities to the end
// higher quantities "bubble" up

// big O-notation
// algebraic equation representing time complexity of an algorithm
// w/ bubble sort each number (N) is compared to every other number once
// O(N * N) or O(N^2) [inefficient]
// compared to find the largest number in an array which is O(N)

public class BubbleSort {
    public static void main(String[] args) {
        int[] unsorted = {7, 2, 5, 3, 6, 1, 4};
        unsorted = sort(unsorted);
        for (int i : unsorted) {
            System.out.print(i + " ");
        }
    }
    public static int[] sort(int[] integers) {
        // for as many elements in integers array
        for (int outer = 0; outer < integers.length; outer++) {
            // check each element and swap as needed
            for (int inner = 1; inner < integers.length; inner++) {
                if (integers[inner - 1] > integers[inner]) {
                    // swap
                    int temp = integers[inner - 1];
                    integers[inner - 1] = integers[inner];
                    integers[inner] = temp;
                }
            }
        }
        return integers;
    }
}

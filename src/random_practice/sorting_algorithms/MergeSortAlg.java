package random_practice.sorting_algorithms;

import java.util.Random;

public class MergeSortAlg {
    public static void main(String[] args) {

        MergeSortAlg obj = new MergeSortAlg();
        int arrayLength = 1_000_000;
        int upperBoundary = Integer.MAX_VALUE;
        int[] nums_1 = obj.randomize_array(arrayLength , upperBoundary);
//        System.out.println("nums_1 pre-sort = " + Arrays.toString(nums_1));
        long start = System.nanoTime();
        obj.mergeSort(nums_1);
//        System.out.println("nums_1 post-sort = " + Arrays.toString(nums_1));
        long end = System.nanoTime();
        System.out.println("Merge sort of " + arrayLength +" took = " + ((end-start) / 1_000_000_000) + "seconds");

        int[] bubble = obj.randomize_array(arrayLength, upperBoundary);
        start = System.nanoTime();
        obj.bubbleSort(bubble);
        end = System.nanoTime();
        System.out.println("Bubble sort of " + arrayLength +" took = " + ((end-start) / 1_000_000_000) + "seconds");

    }

    public void mergeSort(int[] input) {
        int len = input.length;
        if(len < 2) return;

        int middle = len / 2;
        int[] left = new int[middle];
        int[] right = new int[len - middle];

        System.arraycopy(input, 0, left, 0, middle);
        if (len - middle >= 0) System.arraycopy(input, middle, right, 0, len - middle);

        mergeSort(left);
        mergeSort(right);
        merge(input, left, right);
    }

    private void merge(int[] input, int[] left, int[] right) {
        int left_len = left.length;
        int right_len = right.length;
        int left_iter=0, right_iter=0, input_iter=0;

        while(left_iter < left_len && right_iter < right_len) {
            if( left[left_iter] <= right[right_iter]) input[input_iter++] = left[left_iter++];
            else input[input_iter++] = right[right_iter++];
        }
        while(left_iter < left_len) input[input_iter++] = left[left_iter++];
        while(right_iter < right_len) input[input_iter++] = right[right_iter++];
    }

    private int[] randomize_array(int arr_length, int upperBound) {
        int[] numbers = new int[arr_length];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(upperBound);
        }
        return numbers;
    }

    private void bubbleSort(int[] input) {
        for(int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length; j++) {
                if(input[i] > input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
    }

}

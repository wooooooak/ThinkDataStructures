public class SelectionSort {



    public static void selectionSort(int[] array) {
        for (int i=0; i<array.length; i++) {
            int lowestIndexOfArray = indexOfLowest(array, i);
            swap(array, i, lowestIndexOfArray);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int indexOfLowest(int[] array, int start) {
        int lowIndex = start;
        for (int i = start; i < array.length; i++) {
            if (array[i] < array[lowIndex]){
                lowIndex = i;
            }
        }
        return lowIndex;
    }



}

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        Sort arr = new Sort(array);

    }
    
   class Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = 1;
            for (int j = i+1; j<arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
    
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
}
}

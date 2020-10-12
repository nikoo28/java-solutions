package util;

/**
 * Created by nikoo28 on 10/11/20 4:53 PM
 */

public class QuickSort {

  public static void quickSort(int[] arr, int begin, int end) {

    if (begin < end) {
      // Find the partition
      int partition = findPartition(arr, begin, end);

      // Do quick sort on the left part
      quickSort(arr, begin, partition - 1);

      // Do quick sort on the right part
      quickSort(arr, partition + 1, end);
    }
  }

  private static int findPartition(int[] arr, int begin, int end) {

    // Taking last element as pivot element
    int pivot = arr[end];

    int i = (begin - 1); // index of smaller element

    for (int j = begin; j < end; j++) {
      // If current element is smaller than the pivot
      if (arr[j] < pivot) {
        i++;

        // swap arr[i] and arr[j]
        swap(arr, i, j);
      }
    }

    // swap arr[i+1] and arr[high] (or pivot)
    swap(arr, i + 1, end);

    return i + 1;
  }

  private static void swap(int[] arr, int i, int j) {
    int swapTemp = arr[i];
    arr[i] = arr[j];
    arr[j] = swapTemp;
  }

}

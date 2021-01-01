package util;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by nikoo28 on 1/1/21 1:16 AM
 */

public class BucketSort {

  static void bucketSort(int[] arr, int noOfBuckets) {

    boolean isNegativePresent = false;
    int offset = Integer.MAX_VALUE;
    for (int i : arr) {
      if (i < offset) offset = i;
      if (i < 0) isNegativePresent = true;
    }

    int globalMax = Integer.MIN_VALUE;
    int globalMin = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      arr[i] -= offset;
      globalMin = Math.min(arr[i], globalMin);
      globalMax = Math.max(arr[i], globalMax);
    }

    int range = globalMax - globalMin;
    int bucketRange = (int) Math.ceil((double) range / noOfBuckets);

    // Create bucket array
    List<Integer>[] buckets = new List[noOfBuckets];

    // Associate a list with each index in the bucket array
    for (int i = 0; i < noOfBuckets; i++) {
      buckets[i] = new LinkedList<>();
    }

    // Assign numbers from array to the proper bucket
    // by using hashing function
    for (int num : arr) {
      buckets[hash(num, bucketRange, noOfBuckets)].add(num);
    }

    // sort buckets
    for (List<Integer> bucket : buckets) Collections.sort(bucket);

    int idx = 0;
    // Merge buckets to get sorted array
    for (List<Integer> bucket : buckets) {
      for (int num : bucket) {
        arr[idx++] = num;
      }
    }

    if (isNegativePresent) {
      for (int i = 0; i < arr.length; i++) {
        arr[i] += offset;
      }
    }
  }

  // A very simple hash function
  private static int hash(int num, int hashValue, int numberOfBuckets) {
    int bucketNumber = num / hashValue;
    if (bucketNumber == numberOfBuckets)
      bucketNumber--;
    return bucketNumber;
  }
}

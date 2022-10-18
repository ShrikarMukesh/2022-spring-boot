package com.redis;

import javax.persistence.criteria.CriteriaBuilder;

public class Test {
    public static void main(String[] args) {
        int []arr = {1,2,4,8,9,11,14,23};
        int element = 9;
        int low = 0, high = arr.length-1;
        int value = binarySearch(arr,low,high,element);
        System.out.println("Index = "+value);
        int result = runBinarySearchIteratively(arr,element,low,high);
        System.out.println("element present in the index " + result);
    }
    public static int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static int binarySearch(int[] array, int low, int high, int element){
        int index = Integer.MAX_VALUE;
        while (high >= low){
            int mid = high+low/2;
            if(array[mid]  < element){
                low = mid+1;
            }
            else if(array[mid] > element){
                high = mid -1;
            }else if(array[mid]  == element){
                index = mid;
                break;
            }
        }
        return index;
    }
}

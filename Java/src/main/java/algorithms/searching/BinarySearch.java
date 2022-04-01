package algorithms.searching;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,2,2,3,4,5,5,7,7,8,10,12,19,24};
        int size = arr.length;

        // Contains
        System.out.println(contains(arr, 0, size - 1, 10));
        System.out.println(contains(arr, 0, size - 1, 100));

        // Find Next Largest
        System.out.println(findNextLargest(arr, 0, size - 1, 7));
        System.out.println(findNextLargest(arr, 0, size - 1, 26));
        System.out.println(findNextLargest(arr, 0, size - 1, -1));

        // Find Next Smallest
        System.out.println(findNextSmallest(arr, 0, size - 1, 7));
        System.out.println(findNextSmallest(arr, 0, size - 1, -1));
        System.out.println(findNextSmallest(arr, 0, size - 1, 100));
    }

    public static int contains(int[] input, int l, int h, int target) {
        int mid;

        while(l <= h) {
            mid = l + (h - l)/2;

            if(input[mid] == target) {
                return mid;
            } else if(input[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return -1;
    }

    public static int findNextLargest(int[] input, int l, int h, int target) {
        int mid;

        while(l <= h) {
            mid = l + (h - l)/2;

            if(input[mid] > target) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return l == input.length ? -1 : l;
    }

    public static int findNextSmallest(int[] input, int l, int h, int target) {
        int mid;

        while(l <= h) {
            mid = l + (h - l)/2;

            if(input[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return h;
    }
}

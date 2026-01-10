public class Searching {
    static void linearSeatch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("The element are found at index: " + i);
                return;
            }
        }
        System.out.println("The element are not found in array.");
    }

    static void binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            System.out.println("The element are found at index: " + mid);
            return; // exit method
        } else if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    System.out.println("The element are not found in array.");
}
    public static void main(String[] args){
        int[] arr1 = {1, 8, 3, 6, 5, 4, 7, 2, 9};
        linearSeatch(arr1, 5);

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        binarySearch(arr2, 6);
    }
}

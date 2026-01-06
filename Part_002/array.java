public class array {
    public static int[] MaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for(int i : arr){
            if(max < i){
                max = i;
            }
            if(min > i){
                min = i;
            }
        }
        int[] nums = {max, min};
        return nums;
    }
    public static void main(String[] args) {
        array obj = new array();
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        System.out.println(java.util.Arrays.toString(obj.MaxMin(arr)));
    }
}
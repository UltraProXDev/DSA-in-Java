import java.util.Arrays;
public class Main2 {
    int[] prefixSum(int[] arr){
        for(int i = 1; i < arr.length; i++){
            arr[i] += arr[i - 1]; 
        }
        return arr;
    }

    int maxSum(int[] arr, int k){
        int maxSum;
        int temp = 0;
        for(int i = 0; i < k; i++){
            temp += arr[i];
        }
        maxSum = temp;
        for(int i = 1; i < arr.length - k + 1; i++){
            temp = temp - arr[i - 1] + arr[i + k - 1];
            if(temp > maxSum){
                maxSum = temp;
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        Main2 m = new Main2();
        int[] arr = {9,2,12,2};
        System.out.println(m.maxSum(arr, 2));
    }
}

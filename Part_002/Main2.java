import java.util.*;
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

    void hashMap(){
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "ABC");
        hm.put(2, "MNO");
        hm.put(3, "XYZ");
        System.out.println(hm);
        System.out.println(hm.containsKey(4));
        hm.put(2, "PQR");
        System.out.println(hm.get(2));
        
    }
    public static void main(String[] args){
        Main2 m = new Main2();
        m.hashMap();
    }
}

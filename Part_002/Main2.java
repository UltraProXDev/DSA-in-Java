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
        System.out.println(hm.containsKey(3));
        hm.put(2, "PQR");
        System.out.println(hm.get(3));
        
    }

    int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int needed = target - nums[i];
            if(map.containsKey(needed)){
                return new int[] {map.get(needed), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    HashMap<Character, Integer> frequencyCounter(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }

    char firstNonRepeating(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(char c : s.toCharArray()){
            if(map.get(c) == 1){
                return c;
            }
        }
        return '\0';
    }

    int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) > n / 2){
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Main2 m = new Main2();
        int[] nums = {2,2,2,2,3,4,5,2,2,6,4,3,2,2};
    //    m.twoSum(nums, 11);
    //    System.out.println(m.frequencyCounter("Hello world"));
    //    System.out.println(m.firstNonRepeating("abcba"));
    //    System.out.println(m.majorityElement(nums));
    }
}

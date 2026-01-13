import java.util.*;

public class Main3 {
    String reverse(String txt){
        String result = "";
        for(int i = txt.length() - 1; i >= 0; i--){
            result += txt.charAt(i);
        }
        return result;
    }

    int size(String txt){
        int count = 0;
        for(char i : txt.toCharArray()){
            count++;
        }
        return count;
    }

    String remove(String txt){
        return txt.replace(" ", "");
    }

    int numberOfWords(String txt){
        int num = 1;
        txt = txt.strip();
        for(int i = 0; i < txt.length(); i++){
            if(txt.charAt(i) == ' '){
                num++;
            }
        }
        return num;
    }

    boolean isPalindromeWord(String txt){
        int n = txt.length() / 2;
        int a = txt.length();
        for(int i = 0; i < n; i++){
            a--;
            if(txt.charAt(i) != txt.charAt(a)){
                return false;
            }
        }
        return true;
    }

    boolean isPalindromeNum(int num){
        int copyNum = num; 
        int reversedNum = 0;
        while(num != 0){
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return copyNum == reversedNum;
    }

    boolean isPalindromeStr(String str){
        str = str.replace(" ", "").toLowerCase();
        int n = str.length() / 2;
        int a = str.length();
        for(int i = 0; i < n; i++){
            a--;
            if(str.charAt(i) != str.charAt(a)){
                return false;
            }
        }
        return true;
    }



    int count(String str, char c){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                count += 1;
            }
        }
        return count;
    }

    void printChar(String txt){
        ArrayList<Character> lst = new ArrayList<>();
        txt = txt.replace(" ", "").toLowerCase();
        for(int i = 0; i < txt.length(); i++){
            if(lst.contains(txt.charAt(i))){
                System.out.println(txt.charAt(i));
            }else{
                lst.add(txt.charAt(i));
            }
        }
    }

    boolean checkUnique(String txt){
        txt = txt.replace(" ", "").toLowerCase();
        for(int i = 0; i < txt.length(); i++){
            for(int j = i + 1; j < txt.length(); j++){
                if(txt.charAt(i) == txt.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    // linear search.
    int indexOfTarget(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    boolean checkName(String[] arr, String name){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == name){
                return true;
            }
        }
        return false;
    }
    
    int countNum(int[] arr, int target){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }

    int largestNum(int[] arr, int num){
        int largest = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < num && arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    int lastIndex(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i - 1;
            }
        }
        return -1;
    }

    boolean checkDuplicate(int[] arr){
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(!(lst.contains(arr[i]))){
                lst.add(arr[i]);
            }else{
                return true;
            }
        }
        return false;
    }

    int minElement(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    int secondLargest(int[] arr){
        int firstLargest = arr[0];
        int secondLargest = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }else if(arr[i] < firstLargest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    // binary search.
    int targetIndex(int[] arr, int target){
        int first = 0;
        int last = arr.length - 1;
        while(first <= last){
            int mid = (first + last) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                last = mid - 1;
            }else{
                first = mid + 1;
            }
        }
        return -1;
    }

    boolean checkTarget(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                return true;
            }else if(arr[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return false;
    }

    int firstOccur(int[] arr, int target){
        int first = 0;
        int last = arr.length - 1;
        while(first <= last){
            int mid = (first + last) / 2;
            if(arr[mid] == target){
                for(int i = 1; i < arr.length; i++){
                    if(arr[mid - i] != target){
                        return mid - i + 1;
                    }
                }
            }else if(arr[mid] > target){
                last = mid - 1;
            }else{
                first = mid + 1;
            }
        }
        return -1;
    }

    int lastOccur(int[] arr, int target){
        int first = 0;
        int last = arr.length - 1;
        while(first <= last){
            int mid = (first + last) / 2;
            if(arr[mid] == target){
                for(int i = 1; i < arr.length; i++){
                    if(arr[mid + i] != target){
                        return mid + i - 1;
                    }
                }
            }else if(arr[mid] > target){
                last = mid - 1;
            }else{
                first = mid + 1;
            }
        }
        return -1;
    }

    int countNums(int[] arr, int target){
        int first = 0;
        int last = arr.length - 1;
        int count = 0;
        while(first <= last){
            int mid = (first + last) / 2;
            if(arr[mid] == target){
                for(int i = first; i < last; i++){
                    if(arr[i] == target){
                        count++;
                    }
                }
                return count;
            }else if(arr[mid] > target){
                last = mid - 1;
            }else{
                first = mid + 1;
            }
        }
        return 0;
    }

    int SEGOET(int[] arr, int target){
        int first = 0;
        int last = arr.length - 1;
        int count = 0;
        while(first < last){
            int mid = (first + last) / 2;
            if(arr[mid] == target){
                return arr[mid];
            }else if(arr[mid] > target){
                last = mid - 1;
            }else{
                first = mid + 1;
            }
        }
        return arr[last];
    }

    int findPosition(int[] arr, int target){
        int first = 0;
        int last = arr.length - 1;
        int count = 0;
        while(first <= last){
            int mid = (first + last) / 2;
            if(arr[mid] > target){
                if(arr[mid - 1] < target){
                    return mid;
                }
                last = mid - 1;
            }else{
                first = mid + 1;
            }
        }
        return arr.length;
    }

    int findKSmallest(int[] arr, int k){
        return arr[k-1];
    }

    
    public static void main(String[] args){
        Main3 obj = new Main3();
        int[] arr = {2,3,3,4,4,6,7,8,9};
        System.out.println(obj.findKSmallest(arr, 5));
    }
}

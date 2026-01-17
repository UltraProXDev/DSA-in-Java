import java.util.*;
import java.math.*;

public class Main4 {
    static void printOneToN(int n){
        if(n == 0){
            return;
        }
        printOneToN(n - 1);
        System.out.println(n);
    }

    static void printNToOne(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNToOne(n - 1);
    }

    static int sumOfFirstN(int n){
        if(n == 0){
            return 0;
        }
        return n + sumOfFirstN(n - 1);
    }

    static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int fibonacci(int n){
        if(n == 1){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static String reverse(String txt){
        String reverseString = "";
        for(int i = txt.length() - 1; i >= 0; i--){
            reverseString += txt.charAt(i);
        }
        return reverseString;
    }

    static String removeDuplicate(String txt){
        String noDuplicates = "";
        ArrayList<Character> lst = new ArrayList<>();
        for(int i = 0; i < txt.length(); i++){
            if(!(lst.contains(txt.charAt(i)))){
                noDuplicates += txt.charAt(i);
                lst.add(txt.charAt(i));
            }
        }
        return noDuplicates;
    }

    static boolean checkSorted(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }

    static boolean checkNumPowOfTwo(int num){
        boolean bool = true;
        int i = 0;
        while(bool){
            if(num == Math.pow(2, i)){
                bool = false;
                return true;
            }else if(num < Math.pow(2, i)){
                bool = false;
                return false;
            }else{
                i++;
            }
        }
        return false;
    }

    static void solve(int n, char source, char auxiliary, char destination){
        if(n == 1){
            System.out.println("Move disk 1 from "+source+" to "+destination);
            return;
        }
        solve(n - 1, source, destination, auxiliary);
        System.out.println("Move disk "+ n +" from "+source+" to "+destination);
        solve(n - 1, auxiliary, source, destination);
    }

    // bubble sort
    static void countSwaps(int[] arr){
        int count = 0;
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            boolean swapped = false;
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        System.out.println("Sorted array: "+Arrays.toString(arr));
        System.out.println("Swaps: "+count);
    }

    
    //selection sort
    static void findMinElement(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            System.out.println("Minimum Element: "+arr[minIndex]+", Index: "+minIndex);
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    static int[] descendingSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int maxIndex = i;
            for(int j = i + 1; j < n; j++){
                if(arr[maxIndex] < arr[j]){
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    // insertion sort
    static void insertionStep(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;
            while(arr[j] > key && j >= 0){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            System.out.println(Arrays.toString(arr));
        }
    } 

    static void sortLinkedList(LinkedList<Integer> list) {
        int n = list.size();
        for (int i = 1; i < n; i++) {
            int key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j--;
            }
        list.set(j + 1, key);
        }
    }



    static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stk.push(c);
            }else{
                if(stk.isEmpty()) return false;
                char top = stk.pop();
                if(c == ')' && top != '(' || 
                c == ']' && top != '[' || 
                c == '}' && top != '{'){
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }

    static boolean isValidWithChars(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stk.push(c);
            }else{
                if(!stk.isEmpty()){
                    char top = stk.pop();
                    if(c == ')' && top != '(' || 
                    c == ']' && top != '[' || 
                    c == '}' && top != '{'){
                        return false;
                    }
                }
            }
        }
        return stk.isEmpty();
    }

    static int longestValidParentheses(String s) {
        Stack<Character> stk = new Stack<>();
        int count = 0; 
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stk.push(c);
            }else if(c == ')' || c == ']' || c == '}'){
                if(!stk.isEmpty()){
                    char top = stk.pop();
                    if(c == ')' && top == '(' || 
                    c == ']' && top == '[' || 
                    c == '}' && top == '{'){
                        count += 2;
                    }
                }
            }
        }
        return count;
    }

    static int maxDepth(String s) {
        Stack<Character> stk = new Stack<>();
        int count = 0; 
        int maxDepth = 0;
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                count++;
                if(maxDepth < count) maxDepth = count;
                stk.push(c);
            }else if(c == ')' || c == ']' || c == '}'){
                if(!stk.isEmpty()){
                    char top = stk.pop();
                    if(c == ')' && top == '(' || 
                    c == ']' && top == '[' || 
                    c == '}' && top == '{'){
                        count--;
                    }
                }
            }
        }
        return maxDepth;
    }

    public static void main(String[] args){
        System.out.println(maxDepth("()(()(()(()(()()())())())())()"));
    }
}
import java.util.ArrayList;
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
    public static void main(String[] args){
        Main4 obj = new Main4();
        int[] arr = {1,2,3,4,5};
        solve(4, 'A', 'B', 'C');
    }
}

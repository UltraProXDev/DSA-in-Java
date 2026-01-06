import java.util.*;

public class Main1 {

    /*
    Q1. Write a method to take name and age from the user
        and print a greeting message.
    */
    void printNameAge() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Hello, " + name);
        System.out.println("You are " + age + " years old!");
    }

    /*
    Q2. Write a method to find the largest of three numbers.
        If all numbers are equal, return 0.
    */
    int largestOfThreeNum(int a, int b, int c) {
        if (a == b && b == c) {
            return 0;
        } else if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    /*
    Q3. Write a method to check whether a number is Even or Odd.
    */
    String evenOrOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    /*
    Q4. Write a program to print numbers from 1 to 50.
        Print "Fizz" for multiples of 3 and "Buzz" for multiples of 5.
    */
    void fizzBuzz() {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    /*
    Q5. Write a method to return the sum of two numbers.
    */
    int sum(int a, int b) {
        return a + b;
    }

    /*
    Q6. Write a method to take 5 integers from the user
        and store them in an array.
    */
    int[] array() {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    /*
    Q7. Write a method to find the largest and smallest
        element in an array.
    */
    void largestAndSmallest(int[] arr) {
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }

    /*
    Q8. Write a method to find the sum and average of array elements.
    */
    void sumAndAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        int avg = sum / arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }

    /*
    Q9. Write a method to reverse an array.
    */
    int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    /*
    Q10. Write a method to count even numbers in an array.
    */
    int countEvenNum(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    /*
    Q11. Write a method to count vowels in a string.
    */
    int countVowels(String txt) {
        int count = 0;
        txt = txt.toLowerCase();
        for (int i = 0; i < txt.length(); i++) {
            char ch = txt.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    /*
    Q12. Write a method to check if a string is a palindrome.
    */
    String isPalindrome(String txt) {
        String reverse = new StringBuilder(txt).reverse().toString();
        if (txt.equals(reverse)) {
            return "Palindrome";
        } else {
            return "Not Palindrome";
        }
    }

    /*
    Q13. Write a method to reverse a string.
    */
    String reverseString(String txt) {
        String reverse = "";
        for (int i = txt.length() - 1; i >= 0; i--) {
            reverse += txt.charAt(i);
        }
        return reverse;
    }

    /*
    Q14. Write a method to replace spaces with underscores.
    */
    String replace(String txt) {
        return txt.replace(" ", "_");
    }

    /*
    Q15. Write a method to concatenate two strings
        and convert the result to uppercase.
    */
    String concatenate(String str1, String str2) {
        return (str1 + str2).toUpperCase();
    }

    /*
    Q16. Write a program using ArrayList to:
        - Add elements
        - Remove an element
        - Check existence
        - Print elements
        - Find sum of integers
    */
    void arrayListExample() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("John");
        names.add("Jack");

        System.out.println(names);
        names.remove(1);
        System.out.println(names);

        System.out.println(names.contains("Jack"));

        for (String s : names) {
            System.out.println(s.toUpperCase());
        }

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println("Sum: " + sum);
    }

    // -------------------- FINAL MAIN METHOD --------------------
    public static void main(String[] args) {
        Main1 obj = new Main1();

        obj.printNameAge();

        System.out.println("Largest: " + obj.largestOfThreeNum(10, 20, 30));
        System.out.println("Even/Odd: " + obj.evenOrOdd(7));

        obj.fizzBuzz();

        System.out.println("Sum: " + obj.sum(5, 6));

        int[] arr = obj.array();
        obj.largestAndSmallest(arr);
        obj.sumAndAverage(arr);

        arr = obj.reverseArray(arr);
        System.out.println("Even count: " + obj.countEvenNum(arr));

        System.out.println("Vowels: " + obj.countVowels("Education"));
        System.out.println(obj.isPalindrome("madam"));

        System.out.println(obj.reverseString("Java"));
        System.out.println(obj.replace("Hello World"));
        System.out.println(obj.concatenate("java", "program"));

        obj.arrayListExample();
    }
}
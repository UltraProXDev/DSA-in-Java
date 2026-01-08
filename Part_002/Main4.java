public class Main4 {
    void printOneToN(int n){
        if(n == 0){
            return;
        }
        printOneToN(n - 1);
        System.out.println(n);
    }

    void printNToOne(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNToOne(n - 1);
    }

    int sumOfFirstN(int n){
        if(n == 0){
            return 0;
        }
        return n + sumOfFirstN(n - 1);
    }

    int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    int fibonacci(int n){
        if(n == 1){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args){
        Main4 obj = new Main4();
        System.out.println(obj.factorial(10));
    }
}

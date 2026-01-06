public class Main3 {
    String reverse(String txt){
        String result = "";
        for(int i = txt.length() - 1; i >= 0; i--){
            result += txt.charAt(i);
        }
        return result;
    }
/*
    int size(String txt){
        int count = 0;
        for(char i : txt){
            count++;
        }
        return count;
    }
*/
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
    public static void main(String[] args){
        Main3 obj = new Main3();
        System.out.println(obj.isPalindromeStr("A man a plan a canal Panama"));
    }
}

import java.util.*;

public class Main5 {

    public static void reverseQueue(Queue<Integer> queue){
        if(queue.isEmpty()) return;
        int front = queue.poll();
        reverseQueue(queue);
        queue.add(front);
    }

    public static void reverseQueueUsingStack(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()) stack.push(queue.poll());
        while(!stack.isEmpty()) queue.add(stack.pop());
    }

    public static boolean isPalindrome(Queue<Character> queue){
        Stack<Character> stack = new Stack<>();
        Queue<Character> temp = new LinkedList<>(queue);
        while(!temp.isEmpty()) stack.push(temp.poll());
        for(char ch : queue){
            if(ch != stack.pop()) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        reverseQueue(q1);
        System.out.println(q1);

        Queue<Integer> q2 = new LinkedList<>();
        q2.add(4);
        q2.add(5);
        q2.add(6);
        reverseQueueUsingStack(q2);
        System.out.println(q2);

        Queue<Character> q3 = new LinkedList<>();
        q3.add('A');
        q3.add('B');
        q3.add('A');
        System.out.println(isPalindrome(q3));
    }
}

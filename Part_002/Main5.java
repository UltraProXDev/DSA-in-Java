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

    public static void deque1(){
        Deque<Character> deque = new ArrayDeque<>();
        deque.add('B');
        deque.addFirst('A');
        deque.addLast('C');
        System.out.println(deque);

        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
    }

    public static List<Integer> firstNegative(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                dq.addLast(i);
            }
            if(!dq.isEmpty() && dq.peekFirst() <= i - k){
                dq.pollFirst();
            }
            if(i >= k - 1){
                if(dq.isEmpty()){
                    result.add(0);
                }else{
                    result.add(arr[dq.peekFirst()]);
                }
            }
        }
        return result;
    }

    public static List<Integer> minNum(int[] arr, int k){
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        int min = arr[0];
        for(int i = 0; i < k; i++){
            dq.add(arr[i]);
            if(min > arr[i]){
                min = arr[i];
            }
        }
        result.add(min);
        for(int i = 0; i < arr.length - k; i++){
            dq.removeFirst();
            dq.add(arr[i + k]);
            min = arr[i + 1];
            for(int num : dq){
                if(min > num){
                    min = num;
                }
            }
            result.add(min);
        }
        return result;
    }

    public static void removeNth(LinkedList<Integer> lst, int n){
        lst.remove(lst.size() - n);
        for(int i = 0; i < lst.size() - 1; i++){
            System.out.print(lst.get(i) + " -> ");
        }
        System.out.print(lst.get(lst.size() - 1));
    }

    public static void main(String[] args) {
/*      Queue<Integer> q1 = new LinkedList<>();
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

       // deque1();

        int[] arr = {4,3,5,1,6,7,2};
        int k = 2;
        System.out.println(minNum(arr, k));

        */
       LinkedList<Integer> lst = new LinkedList<>();
       lst.add(1);
       lst.add(2);
       lst.add(3);
       lst.add(4);
       lst.add(5);
       removeNth(lst, 2);
    }
}

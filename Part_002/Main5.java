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

    static int findLength1(LinkedList<Integer> lst){
        int count = 0;
        for(int i : lst){
            count++;
        }
        return count;
    }

    static int findLength2(LinkedList<Integer> lst, int count){
        if(!lst.isEmpty()){
            lst.remove();
            count++;
        }else{
            return count;
        }
        return findLength2(lst, count);         
    }

    static boolean isExist(LinkedList<Integer> lst, int target){
        for(int i : lst){
            if(i == target){
                return true;
            }
        }
        return false;
    }

    static int elementIndex(LinkedList<Integer> lst, int target){
        for(int i = 0; i < lst.size(); i++){
            if(lst.get(i) == target){
                return i;
            }
        }
        return -1;
    }

    static int findMiddle(LinkedList<Integer> lst){
        int middleIndex = lst.size() / 2;
        return lst.get(middleIndex);
    }

    static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> lst){
        for(int i = 1; i < lst.size(); i++){
            int temp = lst.get(i);
            lst.remove(i);
            lst.addFirst(temp);
        }
        return lst;
    }

    static int[] mergeTwoSortedLinkedList(LinkedList<Integer> lst1, LinkedList<Integer> lst2) {
        int[] arr = new int[lst1.size() + lst2.size()];
        int a = 0, b = 0;
        for(int i = 0; i < arr.length; i++){
            if(a == lst1.size() && b == lst2.size()){
                break;
            }else if(a == lst1.size() && b < lst2.size()){
                arr[i] = lst2.get(b);
                b++;
            }else if(a < lst1.size() && b == lst2.size()){
                arr[i] = lst1.get(a);
                a++;
            }else if(lst1.get(a) <= lst2.get(b)){
                arr[i] = lst1.get(a);
                a++;
            }else{
                arr[i] = lst2.get(b);
                b++;
            }
        }
        return arr;
    }

    static boolean isPalindrome(LinkedList<Integer> lst){
        LinkedList<Integer> reverse = new LinkedList<>();
        for(int i = 0; i < lst.size(); i++){
            reverse.addFirst(lst.get(i));
        }
        for(int i = 0; i < lst.size(); i++){
            if(lst.get(i) != reverse.get(i)) return false;
        }
        return true;
   }

    static String findNthNodeFromEnd(LinkedList<Integer> lst, int n){
        int b = lst.size() - n;
        int a = b - 1;
        return lst.get(a)+" -> "+lst.get(b);
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
        LinkedList<Integer> lst1 = new LinkedList<>();
        lst1.add(1);
        lst1.add(3);
        lst1.add(5);
        lst1.add(8);
        lst1.add(9);
        LinkedList<Integer> lst2 = new LinkedList<>();
        lst2.add(2);
        lst2.add(4);
        lst2.add(6);
        lst2.add(8);
        lst2.add(10);
    //    removeNth(lst, 2);
    //    System.out.println(findLength1(lst));
    //    System.out.println(findLength2(lst, 0));
    //    System.out.println(isExist(lst, 3));
    //    System.out.println(elementIndex(lst, 4));
    //    System.out.println(findMiddle(lst));
    //    System.out.println(reverseLinkedList(lst));
    //    System.out.println(Arrays.toString(mergeTwoSortedLinkedList(lst1, lst2)));
    //    System.out.println(isPalindrome(lst));
        System.out.println(findNthNodeFromEnd(lst, 3));
    }
}

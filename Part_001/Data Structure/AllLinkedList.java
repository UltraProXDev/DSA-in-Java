import java.util.LinkedList;
public class AllLinkedList{
    public static void linkedList(){
        LinkedList<Integer> lst = new LinkedList<>();
        lst.add(20);
        lst.addFirst(10);
        lst.addLast(30);
        System.out.println("List after adding elements: "+lst);

        lst.remove();
        lst.remove();
        System.out.println("List after deleting elements: "+lst);
    }

    public static void singlyLinkedList(){
        LinkedList<Integer> lst = new LinkedList<>();
        lst.add(10);
        lst.add(20);
        lst.add(30);
        System.out.println(lst);
    }


    public static void main(String[] args){
        singlyLinkedList();
    }
}
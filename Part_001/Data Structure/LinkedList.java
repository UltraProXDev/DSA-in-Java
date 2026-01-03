public class LinkedList {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void delete(int data){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }

        if(head.data == data){
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next != null && current.next.data != data){
            current = current.next;
        }

        if(current.next == null){
            System.out.println("Element not found.");
        }else{
            current.next = current.next.next;
        }
    }

    public void display(){
        Node current = head;
        if(current == null){
            System.out.println("List is empty.");
            return;
        }

        while(current != null){
            System.out.print(current.data +" -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.delete(30);

        System.out.print("Linked List: ");
        list.display();
    }
}

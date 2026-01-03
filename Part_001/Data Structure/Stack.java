public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size){
        maxSize = size;
        stackArray = new int [maxSize];
        top = -1;
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack is Full, Cannot push "+ value);
        }else{
            stackArray[++top] = value;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty, Cannot pop.");
            return -1;
        }else{
            return stackArray[top--];
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty, Cannot peek.");
            return -1;
        }else{
            return stackArray[top];
        }
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return maxSize == top;
    }

    public int size(){
        return top + 1;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty.");
        }else{
            System.out.print("Stack : ");
            for(int i = top; i >= 0; i--){
                System.out.print(stackArray[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.display();
        System.out.println("Popped: "+ myStack.pop());
        System.out.println("Peeked: "+ myStack.peek());
        myStack.display();
    }
}

public class Stack {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stacku{
        public static Node head;
        public static boolean is_Empty(){
            return head==null;
        }
        public static void push(int data){
            Node newnode = new Node(data);
            if(is_Empty()){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
        public static int pop(){
            if(is_Empty()){
                System.out.println("Stack empty bhidu");
                return -1;
            }
            int top = head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if(is_Empty()){
                System.out.println("stack empty bhidu");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stacku s = new Stacku();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.is_Empty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}

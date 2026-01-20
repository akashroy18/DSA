public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        //creation of link list
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newnNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newnNode;
            return;
        }
        
        newnNode.next=head;
        head=newnNode;
    }
    public void addLast(int data){
        Node newnNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newnNode;
            return;
        }
        tail.next=newnNode;
        tail=newnNode;
    }
    public void printLinkList(){
        if(head==null){
            System.out.println("Empty linked list");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"=>");
            temp=temp.next;
        }
        System.out.println();
    }
    public void addMiddle(int data,int index){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newnNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newnNode.next=temp.next;
        temp.next=newnNode;
    }
    public int removefirst(){
        if(size==0){
            System.out.println("linklist is empty");
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removelast(){
        if(size==0){
            System.out.println("linklist is empty");

        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val = prev.next.data;
        prev.next=null;
        size--;
        return val;
    }
    public int search(int key){
        Node temp = head;
        int i = 0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx==-1) {
            return -1;
            
        }
        return 1;
    }
    public int recsearch(int key){
        return helper(head,key);
    }
    public void reverse(){
         Node prev = null;
         Node curr = tail = head;
         Node next;
         while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
         }
         head=prev;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.printLinkList();
        ll.addFirst(5);
        ll.printLinkList();
        ll.addFirst(6);
        ll.printLinkList();
        ll.addLast(8);
        ll.printLinkList();
        ll.addLast(13);
        ll.printLinkList();
        ll.addMiddle(51, 2);
        ll.printLinkList();
        //System.out.println(size);
        System.out.println(ll.removefirst());
        ll.printLinkList();
        System.out.println(ll.removelast());
        ll.printLinkList();
        System.out.println("element at "+ll.search(51));
        System.out.println("elemnt at"+ll.search(89));
        System.out.println(ll.recsearch(51));
        System.out.println(ll.recsearch(89));
        ll.reverse();
        ll.printLinkList();



    }
    
}

package linkedlist.com.prathamesh;
public class linkedList {
    private Node head;
    private Node tail;
    private int size;
    public linkedList(){
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;

    }

    public void  insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;

    }

    public void insert(int val , int index){
        if(index  == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1 ; i < index; i++){
             temp = temp.next ;

        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size+=1;

    }

    public
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int deleteFirst(){
        int val = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return  val;
    }

    public node
    private class  Node{
        private int data;
        private Node next;
        public Node(int val){
            this.data = val;
        }
        public Node(int val , Node next) {
                 this.data = val;
                 this.next = next;
        }

    }
}

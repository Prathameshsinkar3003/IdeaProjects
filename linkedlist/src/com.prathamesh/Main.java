package linkedlist.com.prathamesh;

public class Main{

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.insertFirst(7);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertFirst(10);
        list.insert(11,2);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
    }


}
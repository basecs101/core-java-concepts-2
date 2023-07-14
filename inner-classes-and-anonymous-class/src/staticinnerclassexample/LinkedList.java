package staticinnerclassexample;


//Outer class
// can only have 2 access levels, one is public and other is default.
//LinkedList is top level class.
public class LinkedList {
    //this class has field head of type Node
    Node head;

    //constructor
    public LinkedList(Node head) {
        this.head = head;
    }

    //Creating Node as static class which is a helper of LinkedList class
    //Node is similar to top level class and is not part of object of LinkedList class
    //Node class which static inner class can have all access levels.
    //private, default, protected and public.
    //Note - This Node class is static inner class and hence it cannot access the fields/data members
    //from outer class directly because it is static.
    private static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            //System.out.println(head); this cannot be done
            //because non static field cannot be access in static context
            this.data = data;
            this.next = next;
        }
    }

    void printLL() {
        System.out.print("LinkedList is : ");
        Node temp = head;
        while (temp != null) {
            System.out.print("[" + temp.data + "]-->");
            temp = temp.next;
        }
        System.out.println("null\n");
    }

    void addNode(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Node " + newNode.data + " added successfully!");
        printLL();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(null);
        //Creating an object of Node class.
        LinkedList.Node newNode = new LinkedList.Node(10, null);
        linkedList.addNode(newNode);
        newNode = new LinkedList.Node(20, null);
        linkedList.addNode(newNode);
        newNode = new LinkedList.Node(30, null);
        linkedList.addNode(newNode);
    }
}
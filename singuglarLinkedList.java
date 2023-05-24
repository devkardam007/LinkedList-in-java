public class singuglarLinkedList {
    Node head;
    class Node{
        String data;
        Node next;


        Node (String data){
            this.data = data;
            this.next = null;
        }

    }

    public void addFirst(String data){

        Node newNode = new Node(data);
        if(head == null){

            head = newNode;
            return;

        }

        newNode.next = head;
        head = newNode;

    }

    public void addLasst(String data){

        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while( currNode.next != null ){
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }


    public void deleteFirst(){
        if (head == null ){
            System.out.println("The List Is Empty");
            return;
        }

        head = head.next;

    }

    public void deleteLast(){
        if (head == null ){
            System.out.println("The List Is Empty ");
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null ){

            lastNode = lastNode.next;
            secondLast = secondLast.next;

        }

    }

    public void printList(){
        if ( head == null){

            System.out.println("Empty List");
            return;

        }

        Node currNode = head;
        while (currNode != null){

            System.out.print(currNode.data + "-->" );
            currNode = currNode.next;
            System.out.println("Null");

        }

    }

    public static void main(String[] Args){

        singuglarLinkedList list = new singuglarLinkedList();
        list.addFirst("A");
        list.addFirst("this");
        list.addFirst("is");
        list.addFirst("the");
        list.addFirst("string");
        list.deleteFirst();
        list.printList();

    }

}

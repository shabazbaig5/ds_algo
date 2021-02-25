class Node{
    
    int data;
    Node next = null;
    // Node(int data){
    //     this.data = data;
    // }
    
}


class LinkedList{

    Node head;
    public LinkedList insertAtEnd(LinkedList list, int data){

        Node newNode  = new Node();
        newNode.data = data;
        System.out.println("inserting");
        if(list.head == null){
            System.out.println("first head");
            list.head = newNode;    
        }else{
            Node lastNode = list.head;
            while(lastNode.next != null){
                System.out.println("Loop");
                lastNode = lastNode.next;
            }
            newNode.data = data;
            lastNode.next = newNode;
        }
        return list;
    }


    public void printLinkedList(LinkedList list){

        System.out.println("Printing");
        Node node = new Node();
        node = list.head;
        while(node != null){
            // System.out.println("Printing");

            System.out.print(node.data + "->");
            node = node.next;
        }
        // System.out.print(node.data + "->");

    }
    
    public static void main(String[] args){

        System.out.println("Inside the main function");
        LinkedList list = new LinkedList();

        list.insertAtEnd(list,10);
        list.insertAtEnd(list,20);
        list.insertAtEnd(list,30);
        list.insertAtEnd(list,40);

        list.printLinkedList(list);
    }
}
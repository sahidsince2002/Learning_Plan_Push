public class LLOps {
    Node head;
    

    class Node {
    int value;
    Node next = null;
    
    Node(int value){
       this.value = value;
    }


    public int getValue() {
        return value;
    }


    public void setValue(int value) {
        this.value = value;
    }


    public Node getNext() {
        return next;
    }


    public void setNext(Node next) {
        this.next = next;
    }


   
    
}

 public void insert(int data){
      if(head == null){
        head = new Node(data);
      }else {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
      }
    }

    public void display(){
        Node curr = head; 

        while(curr!=null){
            System.out.println(curr.getValue());
        }
    }
   
   
}

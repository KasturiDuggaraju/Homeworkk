public class linkedlistconcept {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
           this.data=data;
           this.next=null;

        }
    }
    //addfirst
    public void addFirst(String data){
        Node newnode =  new Node(data);
        if(head==null){
            head=newnode;
            return;
        }

        newnode.next=head;
        head=newnode;

    }
    //addlast
    public void addLast(String data){
        Node newnode =  new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node currnode = head;
        while(currnode.next!=null){
            currnode = currnode.next;
        }
        currnode.next = newnode;
    }
    //printlist
    public void printlist(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currnode = head;
        while(currnode!=null){
            System.out.print(currnode.data+" -> ");
            currnode = currnode.next;
        }

        System.out.print(" NULL ");
    }

    public static void main(String[] args){
        linkedlistconcept l1 = new linkedlistconcept();
        l1.addFirst("a");
        l1.addFirst("is");
        l1.addFirst("this");
        l1.addLast("list");
        l1.printlist();


    }
}

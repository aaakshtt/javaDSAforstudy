package DataAlgo;
import java.util.*;

public class SinglyLinnkedList {
    Node head;                          //Create a node head        //Create a class Node which has two attributes: data and next. Next is a pointer to the next node.
    class Node{                         //Class with name Node      //Create another class which has two attributes: head and tail.
        String data;                    //String to store data      
        Node next;                      //Next element with type Node
        Node(String data){              //Constructor
            this.data = data;           //We create data
            this.next = null;           //Next value is null
        }
    }
    //add operation
    //add first , add last
    public void AddFirst(String data){  //Method to addfirst element with parameter data
        Node newNode= new Node(data);   //Create a new object of class Node with data as parameter
        if (head ==null){               //Corner case- if there is no head
            head = newNode;             // Head will be the new node
            return;
        }
        newNode.next = head;            //  Update the next pointer of new node, to point to the current head.
        head = newNode;                 //  Update head pointer to point to the new node.
    }

    public void addlast(String data) {  //function to add data to last position
        Node newNode = new Node(data);  //Create object newNode of class Node by taking data
        if (head == null) {             //COrner case
            head = newNode;             //newNode created will be head
            return;
        }
        Node currNode = head;           //Current node is head
        while (currNode.next != null) { //Until next of current node does not become null we will travserse
                                        //New nodes next pointer points to NULL.
            currNode = currNode.next;   //We will reach last when - next of currNode will be null
                                        //Last nodes next pointer points to the new node.
        }

        currNode.next = newNode;        //When we get the last node we update the next  part of this node
    }

    //print list
    public void printlist(){            //function to print list
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;           //Current node will take take value and assign value of head
        while (currNode != null) {      //print current node
            System.out.print(currNode.data +"->");  //Everytime print data of current node until the next part is not null
            currNode = currNode.next;               //Update value of current node
        }
        System.out.println("null");                 ////Prints each node by incrementing pointer   

    }
    public void deletfirst(){                       //Create a temporary node which will point to the same node as that of head.
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        head = this.head.next;                  //Single line to delete head element
    }
    public void deletelast(){                   //Now we need to travel the list for which we need currentnode
        if (head == null){                      //Corner case
            System.out.println("List is empty");
            return;
        }
        if (head.next ==null){                  //Corner case
            head = null;
            return;
        }
        Node currnode = head;
        Node lastnode = head.next;
        while (lastnode.next != null){      //We traverse using the while loop
            lastnode  = lastnode.next;
            currnode = currnode.next;
        }
        currnode.next = null;

    }
    public static void main(String[] args) {
        SinglyLinnkedList ll = new SinglyLinnkedList();

        ll.AddFirst("a");
        ll.AddFirst("is");
        ll.printlist();

        ll.addlast("list");
        ll.printlist();

        ll.AddFirst("this");                //This is added to the first of above list
        ll.printlist();


        ll.deletfirst();                        //Delete the first element
        ll.printlist();


    }

}

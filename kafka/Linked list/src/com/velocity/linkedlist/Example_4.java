package com.velocity.linkedlist;
public class Example_4 {   
    public class Node{  
        int data;  
        Node next;  
        public Node(int d) {  
            data = d;  
        }  
    }    
    public Node head = null;  
    public Node tail = null;  
    //Function to add elements to the list 
    public void add(int data){  
        //Create new node  
        Node newNode = new Node(data);  
        //check if list is empty  
        if(head == null) {  
            //List is empty, hence head and tail will point to null  
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
            //List is not empty hence tail will point to new node
            tail.next = newNode;  
            //newNode will be the new tail  
            tail = newNode;  
            //new tail will points to head  
            tail.next = head;  
        }  
    }  
    //Function to Display the Circular LinkedList
    public void displayList() { 
		// Temporary iterator to iterate over the list  
        Node temp = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            System.out.println("Circular Linked List: "); 
            do{  
                System.out.print(temp.data + " ");  
                temp = temp.next;  
            }while(temp != head);  
            System.out.println();  
        }  
    }  


	public static void main(String args[]) {
		Example_4 cll = new Example_4 ();
		//Adding elements to the list
		cll.add(1);
		cll.add(2);
		cll.add(3);
		cll.add(4);
		cll.add(5);
		//Dsiplaying the List
		cll.displayList();
	}
}


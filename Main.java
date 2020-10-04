//1. Singly LinkedList Class: Write a LinkedList class based on the Node class discussed. It should support the following operations all in O(1) time: (GET THIS CHECKED BY A TA BEFORE MOVING ON)

//add: Adds single element to the beginning of the list O(1)
//addLast: Adds single element to the end of the list O(1)
//size: returns size of the list O(1)
//getFirst/getLast: gets the first or last element
//delete : delete a node in the list given that node (a pointer to the node you want to delete)
class LinkedList{
  class Node{
    int data;
    Node next;
  }

  Node head;
  Node tail;
  int size;

  public Node getFirst(){
    return this.head;
  }

  public Node getLast(){
    return this.tail;
  }

  public void add(Node node){
    Node temp = this.head;
    this.head = node;
    this.head.next = temp;
    if(this.tail == null){
      this.tail = node;
    }
    this.size++;
  }

  public void addLast(Node node){
    if(this.tail == null){
      this.head = node;
      this.tail = node;
      this.size++;
    }else{
      this.tail.next = node;
      this.tail = node;
      this.size++;
    }
   
  }

  public int size(){
    return this.size;
  }

  public void delete(Node node){
    if (this.head == node){
      this.head = node.next;
      this.size--;
    } else if (this.tail == node){
      Node curNode = this.head;
      Node sucNode = null;
      while(curNode.next != null){
        sucNode = curNode.next;
        if(sucNode == this.tail){
          curNode.next = null;
          this.size--;
        }
        curNode = sucNode;
      }
    }else{
      node.data = node.next.data;
      node.next = node.next.next;
      this.size--;
    }
  }

  
}
class Main {



  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  
}

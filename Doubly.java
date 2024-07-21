class doublyLinkedlist
{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int val)
        {
            data=val;
            next=null;
            prev=null;
        }
    }
    doublyLinkedlist()
    {
        head=null;
        tail=null;
    }
    void insertAtbeginning(int val)
    {
        Node newNode = new Node(val);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            
        }
        else
        {
          head.prev=newNode;
           newNode.next=head;
           head=newNode;
        }
    }
    void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
            
        }
    }
    void insertAtposition(int pos,int val)
    {
        if(pos==0)
        {
            insertAtbeginning(val);
            return;
        }
        Node temp = head;
        
        while(pos!=1)
        { 
            pos--;
            temp=temp.next;
            if(temp==null)
            {
                System.out.println("invalid position");
                return;
            }
            
        }
        Node newNode=new Node(val);
        Node temp2= temp.next;
        newNode.next=temp2;
        temp2.prev=newNode;
        temp.next=newNode;
        newNode.prev=temp;
    }
    void deleteAtposition(int pos)
    {
        if(pos==0)
        {
            deleteAtbeginning();
        }
        Node temp=head;
        while(pos!=1)
        {
            temp=temp.next;
            pos--;
        }
        Node temp2=temp.next;
        temp.next=temp2.next;
        temp2.next.prev=temp;
    }
    void deleteAtbeginning()
    {
        if(head==null)
        {
            throw new IndexOutOfBoundsException("Deletion can't occur");
        }
          
          head=head.next;
          head.prev=null;
          return;
    }
    void reverse()
    {
        Node temp = tail;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            
            temp=temp.prev;
            
        }
        System.out.println("\n");
    }
    
    
}
class Doubly
{
public static void main (String[] args) {
    doublyLinkedlist list = new doublyLinkedlist();
    list.insertAtbeginning(8);
    list.insertAtbeginning(9);
    list.insertAtbeginning(5);
    list.insertAtbeginning(10);
    list.insertAtbeginning(7);
    list.insertAtposition(2,15);
    list.deleteAtposition(3);
    list.reverse();
    list.display();
}
}
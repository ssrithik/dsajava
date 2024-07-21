class Linkedlist
{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int val)
        {
            data=val;
            next=null;
        }
    }
    Linkedlist()
    {
        head=null;
    }
    void insertAtbeginning(int val)
    {
        Node newNode = new Node(val);
        if(head==null)
        {
            head=newNode;
            
        }
        else
        {
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
        Node temp2=temp.next;
       newNode.next=temp2;
       temp.next=newNode;
        
        
    }
    void deleteAtposition(int pos)
    {
        if(pos==0)
        {
            deleteAtbeginning();
        }
        Node temp = head;
        Node temp2;
        while(pos!=1)
        {
            temp=temp.next;
            pos--;
        }
        temp2=temp.next;
        temp.next=temp2.next;
    }
    void deleteAtbeginning()
    {
        if(head==null)
        {
            throw new IndexOutOfBoundsException("Deletion can't occur");
        }
          head=head.next;
          return;
    }
    void reverse()
    {
        Node prev=null;
        Node current=head;
        Node next = head.next;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
    
}
class Main
{
public static void main (String[] args) {
    Linkedlist list = new Linkedlist();
    list.insertAtbeginning(8);
    list.insertAtbeginning(9);
    list.insertAtbeginning(5);
    list.insertAtbeginning(10);
    list.insertAtbeginning(7);
    list.insertAtposition(10,15);
    list.deleteAtbeginning();
    list.reverse();
    list.display();
}
}
/**
 * Created by Krishnakanth on 10/15/2016.
 */
import java.util.*;
public class listnodedeletion {
    public static Node head = null;
    static class Node {
        Node next;
        int data;
    }

    void add( int d)
    {
        if(head == null)
        {
            head = new Node();
            head.data= d;
            System.out.println("Adding head");
        }
        else
        {
            Node current = head;
            Node newnode = new Node();
            while ( current.next!= null)
            {
                current = current.next;
            }

            newnode.data = d;
            current.next = newnode;

        }

    }
    void display ()
    {
        Node current = head;


        while(current != null)
        {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("End of list");
    }
   Node deletenodegreaterthan(int x)
    {

        if(head == null)
        {
            System.out.println("List empty");
        }


        else {
            while(head.data >= x && head!=null)
            {
                head = head.next;
                if(head == null)
                {
                    return head;
                }
            }


            Node temp = head;
           while (temp.next !=  null)
           {

               if(temp.next.data >= x && temp.next != null ) {
                   temp.next = temp.next.next;
               }
               else
               {
                   temp = temp.next;
               }
           }
        }

        return head;
    }
    public static void main(String a[])
    {
        listnodedeletion node = new listnodedeletion();
        node.add(4);
        node.add(5);
        //node.add(2);
        node.add(4);
        node.display();
       Node  res=  node.deletenodegreaterthan(4);
        if( res == null )
        {
            System.out.println("Oops everything deleted!");
        }
        else
        node.display();
    }
}

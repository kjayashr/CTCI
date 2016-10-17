/**
 * Created by Krishnakanth on 11/4/2016.
 *
 */
import  java.util.Stack;
public class nextGreaterElement {

    public static void nge(int input[]) {
        Stack s = new Stack();
        int nxt;
        int current;
        s.push(input[0]);
        for (int i = 1; i < input.length; i++) {

            nxt = input[i];
            if (!s.isEmpty()) {
                current = (int) s.pop();
                while (current < nxt) {
                    //i = i+1;
                    System.out.println("NG of " + current + "is " + nxt);
                    //System.out.println("NG of " + current + "is " + nxt);
                    if(s.isEmpty())
                        break;
                    current = (int) s.pop();
                }
                if (current >= nxt) {
                    s.push(current);

                }
                s.push(nxt);

            }

        }
        while (!s.isEmpty())
        {
            System.out.println("NG of " + s.pop() + "is -1" );
        }



    }




    public static void main( String args[])
    {
        int a[] = {4,5,2,25};
        nge(a);

    }
}

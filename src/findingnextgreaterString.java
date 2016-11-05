import java.util.Arrays;

/**
 * Created by Krishnakanth on 11/4/2016.
 */
public class findingnextgreaterString {

    void swap(char a, char b)
    {

    }
    public static String nextstring(String s)
    {
        int i;
        System.out.println(s);
        char[] str = s.toCharArray();
        for ( i = str.length-1; i > 0; i--) {
            if (str[i] > str[i - 1]) {
                System.out.println("Stopped at i = " + i + "and the char " + str[i]+ ">"+str[i-1]);
                break;
            }

        }
            if(i ==0)
            {
                System.out.println("No next string available");
            }

            int x = str[i-1];
                    int smallest = i;
            System.out.println("x: "+str[i-1]+" Smallest:"+ i);
            for (int j = i+1; j < str.length; j++){
                if (str[j] > x && str[j] < str[smallest])
                    smallest = j;
            }

            char temp = str[smallest];
            str[smallest] =str[i-1];
            str[i-1] = temp;
            System.out.println(str);
            Arrays.sort(str,i,str.length);
            System.out.println(str);
            return str.toString();




    }

    public static void main(String args[])
    {
        String s = "534976";
        String st = "abcdef";
        System.out.println(nextstring(st));
    }

}

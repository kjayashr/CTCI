/**
 * Created by Krishnakanth on 10/15/2016.
 */
public class rotationchecker {

    public static void main(String a[])
    {
        String s1 = "JustdoIt";
        String s2 = "doItJust";

      System.out.println(isrotation(s1,s2));
    }

    public static boolean isrotation( String s1, String s2)
    {
        if(s1.length()!= s2.length())
        {
            return false;
        }
        else{
           String b =  s1.concat(s1);
            if(b.contains(s2))
            {
                return true;
            }

        }
     return false;
    }
}

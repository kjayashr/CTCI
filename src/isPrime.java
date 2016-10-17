/**
 * Created by Krishnakanth on 10/16/2016.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class isPrime {

        static void isPrimecheck(int n)
        {
            if(n == 2)
            {
                System.out.println("Prime") ;
                return;
            }
            else if(n < 2)
            {
                System.out.println("Not prime") ;
                return;
            }
            else if (n%2 == 0)
            {
                System.out.println("Not prime") ;
                return;
            }
            else
            {
                for ( int i= 3; i*i <= n;i=i+2)
                {
                    if(n%i == 0 )
                    {
                        System.out.println("Not prime factor:"+i);
                        return;
                    }
                }
                System.out.println("Prime")  ;

            }
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int p = in.nextInt();
            for(int a0 = 0; a0 < p; a0++){
                int n = in.nextInt();
                isPrimecheck(n);
            }
        }
    }




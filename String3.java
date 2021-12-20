
import java.io.*;
import java.util.*;
class String3 {
    public static void main (String[] args) {
        boolean [] alphabets = new boolean[26];
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the number of test cases: ");
        int t = scn.nextInt();
        System.out.print("enter the string values: ");
        while (t > 0)
        {
            int count = 0;
            String s = scn.next();
            s = s.toLowerCase();

            for(int i = 0; i < s.length(); i++)
            {
                if(alphabets[s.charAt(i) -'a'] == false)

                {
                    count++;
                    alphabets[s.charAt(i) -'a'] = true;

                }

            }
            if (count == 26)
            {
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
            Arrays.fill(alphabets, false);
            t--;

        }


    }
}
import java.io.*;
 import java.util.*;
class String4 {
    public static void main (String[] args) {
        // Your code here

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = scan.next();
        }

        // scan.nextLine();
        // String input = scan.nextLine(); // geeksforgeeks geeks geek geezer
        // String[] arr = input.split(" "); // [geeksforgeeks, geeks, geek, geezer]


        boolean isSame = true;

        int count = 0;
        //System.out.println("arr[0]"+arr[0].length());
        for(int i = 0; i < arr[0].length(); i++)// characters
        {
            char currentChar = ' ';
            //System.out.println("n:"+n);
            for(int j = 0; j < n; j++) // array elements
            {
                String currentString = arr[j];

                if(j == 0){
                    currentChar = currentString.charAt(i);
                }
                else if(currentChar != currentString.charAt(i)){
                    isSame = false;
                    break;
                }
            } // nested-for-loop

            if(isSame == false)
            {
                break;
            }
            count++;
        }//end-of-outer-for

        if(count == 0)
        {
            System.out.println("-1");
        }else {
            System.out.println(arr[0].substring(0, count));
        }

    }



}

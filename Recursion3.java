import java.io.*;
import java.util.*;
    class Recursion3 {
        public static void main (String[] args) {
            // Your code here

            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            char ch1 = 'A';
            char ch2 = 'B';
            char ch3 = 'C';
// int count = 0;
            toh(n, ch1, ch2, ch3);
        }
        public static void toh(int n, char ch1, char ch2, char ch3){

            if(n==0){
                return;
            }
            toh(n-1,ch1,ch3,ch2);
            System.out.println( n + ":" + ch1 + "->" + ch3);
            toh(n - 1, ch2, ch1, ch3);
        }





    }


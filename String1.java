import java.io.*;
import java.util.*;
class String1 {
    public static void main (String[] args) {
        // Your code here
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the palindrome name: ");
        String s = scn.nextLine();
        int i=0,j=s.length()-1,c=0;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                c++;
            }
            i++;
            j--;
        }
        if(c==0){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
}

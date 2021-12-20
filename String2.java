import java.io.*;
import java.util.*;
class String2{
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the string value: ");
        String s = scn.next();
        for(int i=0;i<s.length();i=i+2){
            System.out.print(s.charAt(i) + " ");
        }
    }
}

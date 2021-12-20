import java.io.*;
import java.util.*;
import java.lang.Math;
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        double sum = 0;
        double[]arr= new double[n] ;
        for (int i=0; i<n; i++){
            arr[i] = reader.nextDouble();
            sum = sum + arr[i];
        }
        double averageheight = (sum/n);
        int value = (int)Math.floor(averageheight);
        System.out.println(value);
    }
}

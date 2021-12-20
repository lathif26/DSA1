import java.io.*;
import java.util.*;
public class Recursion1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of test cases: ");
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            double x = sc.nextDouble();
            int n = sc.nextInt();
            System.out.println(String.format("%.2f", getPower(x, n)));
        }
    }
    static double getPower(double x, int n){
        if (n == 0){
            return 1;
        }
        if (n < 0){
            return (1 / x) * getPower(x, n + 1);
        }
        return x * getPower(x, n - 1);
    }
}

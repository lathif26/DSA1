import java.io.*;
import java.util.*;

 public class Multidim2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int priD = 0, secD = 0;
        System.out.println("enter the value of N");
        int N = input.nextInt();
        int arr[][] = new int[N][N];
        System.out.println("enter the value of N*N");
        for(int i = 0; i < N; i++ ){
            for(int j = 0; j < N; j++ )
            {
                arr[i][j] = input.nextInt();
                if( i == j ) {
                    priD += arr[i][j];
                }
                if ((i+j) == (N-1)){
                    secD += arr[i][j];
                }
            }
        }
        System.out.print(priD + " " + secD);
        System.out.println();
    }
}

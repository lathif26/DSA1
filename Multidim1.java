import java.io.*;
import java.util.*;
public class Multidim1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of M , N : ");
        int M = input.nextInt();
        int N = input.nextInt();
        int arr[][] = new int [M][N];
        int maxSum = 0, sumCol = 0;
        System.out.println("enter the " + M*N + " value  : ");
        for(int i = 0; i< M; i++ ){
            for(int j = 0; j< N; j++ ){
                arr[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i < N; i++ ){
            sumCol = 0;
            for(int j = 0; j < M; j++ ){
                sumCol += arr[j][i];
            }

            if(sumCol > maxSum){
                maxSum = sumCol;
            }
        }
        System.out.print(maxSum + "\n");
    }
}

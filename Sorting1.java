import java.io.*;
import java.util.*;

class Sorting1{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);


        int t=sc.nextInt();
        for(int i=0; i<t; i++){
            int size=sc.nextInt();
            int arr[]=new int[size];
            //int x=arr.length;

            for(int j=0; j<arr.length; j++){
                arr[j]=sc.nextInt();
            }


            for (int k = 0; k <=arr.length; k++){
                for (int j = 0; j < arr.length-k-1; j++){
                    if (arr[j] > arr[j+1])
                    {

                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println(" ");
        }
    }
}

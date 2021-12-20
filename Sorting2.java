import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Sorting2 {
    public static void main (String[] args) {
        // Your code here
        Scanner scn = new Scanner (System.in);
        int N = scn.nextInt();
        int [] arr = new int[N];
        for(int i=0; i< N;i++){
            arr[i]= scn.nextInt();
        }
        for (int l= 0; l<=arr.length; l++){
            for (int j = 0; j < arr.length-l-1; j++){
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }for(int j=0; j<arr.length; j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println(" ");
        int K = scn.nextInt();
        for(int i = 2; i < 2 + K ; i++){
            System.out.println(arr[2] + arr[3]);
        }
    }

}


    import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

    // don't change the name of this class
// you can add inner classes if needed
   public class Array1 {
        public static void main (String[] args) {
            // Your code here
            Scanner scn = new Scanner(System.in);
            int t = scn.nextInt();
            int[]arr = new int[1000000];
            while(t>0){
                int n = scn.nextInt();
                for(int i = 0;i<n;i++){
                    arr[i] = scn.nextInt();
                }
                Arrays.sort(arr,0,n);
                for(int i = 0;i<3;i++){
                    System.out.print(arr[n-1-i]+ " ");
                }
                System.out.println();
                t--;
            }
        }
    }


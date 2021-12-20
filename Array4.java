import java.io.*; // for handling input/output
        import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Array4 {
    public static void main (String[] args) {
        // Your code here

        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] arr = new int[N];
        boolean increasing = true;
        for (int i=0; i<N; i++){
            arr [i] = scn.nextInt();
            if (i>0 && arr[i-1]>=arr[i]){
                increasing = false;
            }
        }
        if (increasing == true){
            System.out.println("YES");
            return;
        }
        int factor = 2;
        for (int i = 1; i<N; i++){
            while (factor <= arr[i] && arr[i]%factor!=0){
                factor++;
            }
            if (factor > arr[i]){
                System.out.println("NO");
                return;
            }
            factor++;
        }
        System.out.println("YES");
    }
}

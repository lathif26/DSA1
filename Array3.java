public class Array3 {
    static void SumAndMean(int arr[],int N){
        int sum =0;
        for(int i=0;i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.print(sum + " ");
        int avg = sum/N;

        System.out.print(avg);
        //Enter your code here
    }
}

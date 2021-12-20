public class Recursion4 {
    public static int sumOfProductOfDigits(int n1, int n2)
    {
        // Your code here
        int sum = 0;
        while(n1>0 && n2>0){
            sum = sum + ((n1 % 10)*(n2 % 10));
            n1= n1/10;
            n2= n2/10;
        }
        return sum;
    }
}

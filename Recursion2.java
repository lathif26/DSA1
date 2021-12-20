public class Recursion2 {
    static long  Fibonacci(long  n)
    {
        //Enter your code here
        return (n<=1)? n : (Fibonacci(n-1) + Fibonacci(n-2));
    }
}

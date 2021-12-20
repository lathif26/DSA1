public class Recursion5 {
    static int Factorial(int N){
//Enter your code here
        return(N==0)? 1: N*Factorial(N-1);
    }
}

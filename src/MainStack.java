public class MainStack {
    public static void main(String[] args) {
        System.out.println("Main started");
        //int result = factorial(-1);

        try{

           int result= factorial(-1);
        } catch(StackOverflowError e){
            System.out.println("Crash!!!");
        }
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}





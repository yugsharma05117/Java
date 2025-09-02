import java.util.Scanner;
class One{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("ENter the number for factorial: ");
        int number = sc.nextInt();

        if(number<0){
            System.out.print("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1;
            for(int i=1; i<=number; i++){
                factorial *= i;
            }
            System.out.print("Factorial of " + number + " is: " + factorial);
        }
    }
}
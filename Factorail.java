import java.util.Scanner;

public class Factorail {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Factorial number: ");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1; i<=num; i++){

            fact=fact*i;

        }
        System.out.print("Factorial of ");
        System.out.println(num+" is "+fact);


        
    }
}

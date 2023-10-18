import java.util.Scanner;

public class Fibonacii {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of term: ");
        int term=sc.nextInt();
        int first=0;
        int second=1;
        int next=0;
        for(int i=1; i<=term-2; i++){

            next=first+second;
            first=second;
            second=next;


        }
        System.out.println(next);
sc.close();
    }
}

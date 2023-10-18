import java.util.Scanner;
public class palimdrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int sum=0;
        int num=sc.nextInt();
        int temp=num;

        for(    ; num>0 ; num=num/10 ){

                 int rem=num%10;
                     sum=sum*10+rem;

        }
        if(temp==sum){
            System.out.println(temp+" is Palimdrome");
        }
        else{
            System.out.println(temp+" is not  Palimdrome");

        }
      sc.close();
    }
}

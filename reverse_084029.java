import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number: ");
                                                            // int num=sc.nextInt();
        for( int num=sc.nextInt()  ; num>0 ; num=num/10 ){  // for(   ; num>0 ;   )

            int rem=num%10;
                sum=sum*10+rem;
                                                            //   num=num/10;
        }
        System.out.println("Reverse: "+sum);

       sc.close(); 
    }
}

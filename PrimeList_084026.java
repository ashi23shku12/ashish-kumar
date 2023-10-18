import java.util.Scanner;
public class PrimeList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range: ");
        int num=sc.nextInt();
        int n=num;
        int temp=0;

        for(int i=1; i<=n ; i++){

            for(int j=2; j<=i-1; j++){

                if(i%j==0){

                    temp=temp+1;

                }
            }
            if(temp==0){

                System.out.println(i+" prime");
            }
            else{
                
                temp=0;
            }
           
        }
        
    }
}

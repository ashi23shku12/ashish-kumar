import java.util.Scanner;

//2mport javax.script.ScriptEngineManager;

public class areaofrectengle {
   public static void main(String[] args) {
     /*
       formula of area o frecngle 
       area=3.14*r*r
      */
      double r,area;
      Scanner sc = new  Scanner(System.in);
      System.out.println("ENTER ANY R");
      r=sc.nextDouble();
      System.out.println("THE ENTERED R ARE -->>"+r);
      area=3.14*r*r;
      System.out.println("THE AREA OF CIRCLE -->>"+area); 
      sc.close();
   }
}

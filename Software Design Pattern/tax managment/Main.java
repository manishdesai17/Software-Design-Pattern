import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter tax name(properttax | watertax ):");
      String taxname = sc.next();
      System.out.println("Enter Mc name (properttax | watertax ):");
      String taxtype = sc.next();
      if(taxname.equalsIgnoreCase("propertytax"))
      {
         PropertyTax pt=Property_Factory.getpPropertyTax(taxtype);
         pt.CalculateTax();
      }
      else
      {
         WaterTax wt=Water_Factory.getwWaterTax(taxtype);
         wt.CalculateTax();
      }
   
   }
}
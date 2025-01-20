import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter city name:");
    String taxcity=sc.next();
    PropertyTax p=Property_Factory.getpPropertyTax(taxcity);
    System.out.println(p.CalculateTax(10));
 }   
}
aaaa
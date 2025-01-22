import java.util.Scanner;

public class Main {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter os name:");
        String osname=sc.next();
        System.out.println("Enter component name:");
        String comname=sc.next();
        AbstractFactory.getcomponent(osname, comname);
    }
}

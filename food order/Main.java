import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dish name:");
        String type = sc.next();
        Abstract_Factory ab = Abstract_Factory.getdishes(type);
        if (ab != null) {
            appetizers ap = ab.getAppetizers();
            System.out.println(ap.create_appetizers());

            desserts ds = ab.getDesserts();
            System.out.println(ds.Create_desserts());

            main_course mc = ab.getMain_course();
            System.out.println(mc.Create_Main_course());
        } else {
            System.out.println("Enter valid dishes name..");
        }
    }
}

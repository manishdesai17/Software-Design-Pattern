import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter os name:");
        String osname=sc.next();
        AbstractFactory ab=AbstractFactory.getComponent(osname);
        Button b=ab.getButton();
        System.out.println(b.createButton());
        checkbox ck=ab.getCheckbox();
        System.out.println(ck.createcheckbox());
        RadioButton rb=ab.geRadioButton();
        System.out.println(rb.createRadioButton());

    }
}

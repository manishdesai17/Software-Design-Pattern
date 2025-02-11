public class Main {
    public static void main(String[] args) {
        proxycalculator p2=new proxycalculator("admin");
        double sum= p2.sumofnum(10, 20);
        if(sum!=-1)
        {
            System.out.println("sum="+sum);
        }
        else
        {
            System.out.println("access permition denied.");
        }
    }
}

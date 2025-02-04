class singletonObj implements Cloneable{
    private static singletonObj obj = new singletonObj();

    public static singletonObj getinstance() {
        return obj;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void display(String msg) {
        System.out.println("done program by "+msg);
    }
}
public class singeltondemo3 {
    public static void main(String[] args) {
        singletonObj obj = singletonObj.getinstance();
        try {
            singletonObj obj1 = (singletonObj) obj.clone();
            obj1.display("obj1");
        } catch (Exception e) {
            System.out.println("create clone is not possible");
        }
    }
}

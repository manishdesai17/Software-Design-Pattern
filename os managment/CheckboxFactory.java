public class CheckboxFactory {
    public static checkbox getCheckbox(String type) {
        checkbox ob = null;
        if (type.equalsIgnoreCase("window")) {
            ob = new WC();
        } else if (type.equalsIgnoreCase("linux")) {
            ob = new LC();
        } else {
            ob = new MC();
        }
        return ob;
    }
}

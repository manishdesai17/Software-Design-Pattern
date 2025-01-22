public class ButtonFactory {
    public static Button getButton(String type) {
        Button ob = null;
        if (type.equalsIgnoreCase("window")) {
            ob = new WB();
        } else if (type.equalsIgnoreCase("linux")) {
            ob = new LB();
        } else {
            ob = new MB();
        }
        return ob;
    }
}

public class RadioButtonFactory {
    public static RadioButton getRadioButton(String type) {
        RadioButton ob = null;
        if (type.equalsIgnoreCase("window")) {
            ob = new WRB();
        } else if (type.equalsIgnoreCase("linux")) {
            ob = new LRB();
        } else {
            ob = new MRB();
        }
        return ob;
    }
}

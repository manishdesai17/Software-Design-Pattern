public class windowFactory<T> {
    public static T getwindowComponent(String type) {

        if (type.equalsIgnoreCase("button")) {
            Button<Button> ob = null;
            ob = new WB();
            return ob;
        } else if (type.equalsIgnoreCase("checkbox")) {
            checkbox<checkbox> ob = null;
            ob = new WC();
            return ob;
        } else {
            RadioButton<RadioButton> ob = null;
            ob = new WRB();
            return ob;
        }

    }
}

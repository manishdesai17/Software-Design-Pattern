public abstract class AbstractFactory {
    abstract Button getButton();
    abstract checkbox getCheckbox();
    abstract RadioButton geRadioButton();
    public static AbstractFactory getComponent(String ostype)
    {
        AbstractFactory ab=null;
        if(ostype.equalsIgnoreCase("window"))
        {
            ab=new WindowFactory();
        }
        else if(ostype.equalsIgnoreCase("linux"))
        {
            ab=new LinuxFactory();
        }
        else if(ostype.equalsIgnoreCase("mac"))
        {
            ab=new MacFactory();
        }
        return ab;
    }
}

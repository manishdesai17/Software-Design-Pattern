public class MacFactory  extends AbstractFactory{
    public Button getButton()
    {
       Button button=null; 
       button=new MB();
       return button;
    }
    public checkbox getCheckbox()
    {
       checkbox ck=null;
       ck=new MC();
       return ck;
    }
    public RadioButton geRadioButton()
    {
          RadioButton rb=null;
          rb=new MRB();
          return rb;
    }
}

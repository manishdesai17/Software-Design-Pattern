public class LinuxFactory extends AbstractFactory{
    public Button getButton()
    {
       Button button=null; 
       button=new LB();
       return button;
    }
    public checkbox getCheckbox()
    {
       checkbox ck=null;
       ck=new LC();
       return ck;
    }
    public RadioButton geRadioButton()
    {
          RadioButton rb=null;
          rb=new LRB();
          return rb;
    }
}

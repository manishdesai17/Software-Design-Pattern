public class WindowFactory extends AbstractFactory{
 public Button getButton()
 {
    Button button=null; 
    button=new WB();
    return button;
 }
 public checkbox getCheckbox()
 {
    checkbox ck=null;
    ck=new WC();
    return ck;
 }
 public RadioButton geRadioButton()
 {
       RadioButton rb=null;
       rb=new WRB();
       return rb;
 }
}

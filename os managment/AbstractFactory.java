public class AbstractFactory {
    public static void getcomponent(String ostype,String comtype)
    {
        
        if(comtype.equalsIgnoreCase("button"))
        {
            Button b=null;
            b=ButtonFactory.getButton(ostype);
            System.out.println(b.createButton());
        }
        else if(comtype.equalsIgnoreCase("checkbox"))
        {
            checkbox ch=null;
            ch=CheckboxFactory.getCheckbox(ostype);
            System.out.println(ch.createcheckbox());
        }
        else if(comtype.equalsIgnoreCase("radiobutton"))
        {
            RadioButton rb=null;
            rb=RadioButtonFactory.getRadioButton(comtype);
            System.out.println(rb.createRadioButton());
        }
        else
        {
            System.out.println("Enter valid component..");
        }
    }
}

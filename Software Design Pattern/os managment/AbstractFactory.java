public class AbstractFactory {
    public static void getcomponent(String ostype,String comtype)
    {
        // Button<Button>  ob=null;
        windowFactory<windowFactory> ob=new windowFactory<>();
        if(ostype.equalsIgnoreCase("Window"))
        {
            ob=windowFactory.getwindowComponent(comtype);
            System.out.println(ob.createButton());
        }
    }
}

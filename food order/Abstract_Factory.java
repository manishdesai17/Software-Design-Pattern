public abstract class Abstract_Factory {
    abstract appetizers getAppetizers();
    abstract desserts getDesserts();
    abstract main_course getMain_course();
    public static Abstract_Factory getdishes(String type)
    {
        Abstract_Factory ab=null;
        if(type.equalsIgnoreCase("indian"))
        {
           ab=new Indian_factory();
        }
        else if(type.equalsIgnoreCase("chinese"))
        {
            ab=new Chinese_factory();
        }
        return ab;
    }
}

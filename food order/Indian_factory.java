public class Indian_factory  extends Abstract_Factory{

    @Override
    appetizers getAppetizers() {
       appetizers ab=new Indian_appetizers();
       return ab;
    }

    @Override
    desserts getDesserts() {
        desserts ab=new Indian_desserts();
        return ab;
    }

    @Override
    main_course getMain_course() {
       main_course ab=new Indian_main_course();
       return ab;
    }
    
}

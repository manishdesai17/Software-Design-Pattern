public class Chinese_factory extends Abstract_Factory{

    @Override
    appetizers getAppetizers() {
      appetizers ab=new Chinese_appetizers();
      return ab;
    }

    @Override
    desserts getDesserts() {
            desserts ab=new Chinese_desserts();
            return ab;
    }

    @Override
    main_course getMain_course() {
        main_course ab=new Chinese_main_course();
       return ab;
    }
    
}

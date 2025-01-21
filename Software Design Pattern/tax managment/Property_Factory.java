public class Property_Factory {
    public static PropertyTax getpPropertyTax(String taxCity) {
        PropertyTax pt = null;
        switch (taxCity) {
            case "amc":
                pt = new Amc();
                break;
            case "smc":
                pt = new Smc();
                break;
            default:
                System.out.println("please enter valid input");
                break;
        }
        return pt;
    }
}

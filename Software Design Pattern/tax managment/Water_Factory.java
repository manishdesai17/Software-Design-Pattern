public class Water_Factory {
    public static WaterTax getwWaterTax(String taxCity) {
        WaterTax pt = null;
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

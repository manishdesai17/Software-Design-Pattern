public class Amc implements PropertyTax,WaterTax {
    public double CalculateTax(double amount)
    {
       return amount*0.02;
    }
}

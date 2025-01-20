public class Smc implements PropertyTax,WaterTax{
    public double CalculateTax(double amount)
    {
       return amount*0.03;
    }
}

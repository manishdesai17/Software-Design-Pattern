public class proxycalculator implements proxycal {
    public String urole;
    realcalculator rc=new realcalculator();
    public proxycalculator(String urole)
    {
        this.urole=urole;
    }
    public double sumofnum(double v1, double v2) {
        if(urole=="admin")
        {
            return rc.sumofnum(v1, v2);
        }
        else
        {
            return -1;
        }
    }
}

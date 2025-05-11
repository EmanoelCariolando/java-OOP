package entities;

public class otherClass {

      static final double iof = 0.06;

      public static double dollarCost(double dollar, double howMany) {
       return dollar * howMany;
      }
      public static double sumIof(double dollar, double howMany){
            double base = dollarCost(dollar,howMany);
            return base + base * iof;
      }
}



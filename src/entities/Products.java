package entities;

public class Products {
      private int acNumber;
      private String name;
      private double value;

      public Products(int acNumber, String name, double initialDeposit){
       this.acNumber = acNumber;
       this.name = name;
       deposit(initialDeposit);
      }
      public Products(int acNumber, String name){
            this.acNumber = acNumber;
            this.name = name;
      }

      public int getAcNumber(int acNumber){
            return acNumber;
      }
      public String getName(String name){
            return name;
      }
      public void setName(String name){
            this.name = name;
      }
      public double getValue(double value){
            return value;
      }

      public void deposit(double amount){
            value += amount;

      }
      public void withdraw(double amount){
            value -= amount + 5.00;
      }

       public String toString(){
           return " Account "  +  acNumber + " , " + "Holder:" + name + ", Balance:" + value;
       }



}


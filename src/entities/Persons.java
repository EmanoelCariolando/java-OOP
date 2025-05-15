package entities;

public class Persons {
      private String name;
      private int age;
      private double height;


      public Persons(String name,int age,double height) {
       this.name = name;
       this.age= age;
       this.height = height;
      }

      public double getHeight() {
            return height;
      }

      public int getAge() {
            return age;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public void setAge(int age) {
            this.age = age;
      }

      public void setHeight(double height) {
            this.height = height;
      }
}
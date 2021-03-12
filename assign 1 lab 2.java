package car;
public class Car {

  String model;
  int Num;
  String colour;
  
  
  
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public void Fueling(){
        System.out.println("I want to refuel my car otherwise it will run out ");
    }
    public void Running(){
        System.out.println("My car is running very fastly");
    }
    public void Display(){
        System.out.println("My car is "+ model +" model"+" its number is "+ Num +" with "+ colour +" colour ");
    }
    
}

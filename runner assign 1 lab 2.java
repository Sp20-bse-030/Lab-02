package car;

public class Lab2_Assign1_runner {
    public static void main(String[]args){
       Car c1 = new Car();
       Car c2 = new Car();
       c1.model = "latest";
       c1.Num = 1098;
       c1.colour = "white";
       c2.model = "old";
       c2.Num = 7457;
       c2.colour = "Black";
       c1.Fueling();
       c1.Running();
       c2.Fueling();
       c2.Running();
       c1.Display();
       c2.Display();
       
       
       
       
       
    }
    
}

package car;

public class Lab2_Assign2_runner {
    public static void main(String[]args){
        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle();
        r1.sides = 4;
        r1.lenght = 6;
        r1.width = 3;
        r2.sides = 4;
        r2.lenght = 9;
        r2.width = 4;
        r1.Area();
        r1.Cercumfarence();
        r2.Area();
        r2.Cercumfarence();
        r1.Display();
        r2.Display();
    }
    
}

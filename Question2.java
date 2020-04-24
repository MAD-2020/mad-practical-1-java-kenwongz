import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner object = new Scanner(System.in);
    double height;
    double weight;
    
    System.out.println("Enter height: "); 
    height = object.nextDouble();   

    System.out.println("Enter weight: ");
    weight = object.nextDouble();
       
    System.out.println("Height is: " + height);
    System.out.println("Weight is: " + weight);    
  }
}

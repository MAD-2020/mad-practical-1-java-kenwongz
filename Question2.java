import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner object = new Scanner(System.in);
    double height;
    double weight;
    double bmi;
    
    System.out.println("Enter height in meters: "); 
    height = object.nextDouble();   

    System.out.println("Enter weight in kilogram: ");
    weight = object.nextDouble();
       
    System.out.println("Height is: " + height);
    System.out.println("Weight is: " + weight);    

    bmi = weight / (height * height);
    System.out.println("The BMI is: " + bmi);
  }
}

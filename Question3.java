import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    Scanner object = new Scanner(System.in);
    int num;

    System.out.println("Enter number: ");
    num = object.nextInt();

    System.out.println("Result: " + (num * num));
  }
}

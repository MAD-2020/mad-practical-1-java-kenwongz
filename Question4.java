import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    int i, j, rows;
    Scanner object = new Scanner(System.in);

    System.out.println("Enter the base of the triangle: ");
    rows = object.nextInt();

    for(i = 1; i <= rows; i++)
    {
        for(j=i; j <= rows; j++)
        {
            System.out.print("* ");
        }
        System.out.println("");
    }     
  }
}

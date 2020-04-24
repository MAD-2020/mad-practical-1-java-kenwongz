import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner object = new Scanner(System.in);
    System.out.print("How many number would you like to input?");
    int x = object.nextInt();
    int[] numberlist = new int[x];
          
    for(int i = 0; i < numberlist.length; i++) {
      System.out.print("Input number " + (i + 1) + ":");
       numberlist[i] = object.nextInt();
    }
  
  Arrays.sort(numberlist); 
  int n = numberlist.length;
  
  int countofmax = 1;
  int temp = numberlist[0]; 
  int count = 1; 
  
  for (int i = 1; i < numberlist.length; i++) 
  { 
    if (numberlist[i] == numberlist[i - 1]) 
      count++; 
    else
    { 
      if (count > countofmax) 
      { 
        countofmax = count; 
        temp = numberlist[i - 1]; 
      } 
      count = 1; 
    } 
  } 

 
  if (count > countofmax) 
  { 
    countofmax = count; 
    temp = numberlist[n - 1]; 
  } 
  System.out.println("The mode is:" + temp);     
  }
}

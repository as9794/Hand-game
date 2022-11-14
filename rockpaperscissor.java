import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.util.Random;
public class rockpaperscissor {
  public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println(" Enter 1 for rock, Enter 2 for scissor,Enter 3 for paper");
      int ui = sc.nextInt();      // variable for user input
      Random rd = new Random();   // function created for taking variables from computer
      int comp= rd.nextInt(3);    // boundary has been set here for variable so it will take 3 nos only
      if(ui==comp)
      {
          System.out.println("Draw");
      }
    else if (ui==1 && comp==2 || ui==2 && comp==3 || ui==3 && comp==1 )
    {
        System.out.println("You Win");
    }
    else
    {
        System.out.println("Computer Wins");
    }
  }  
}

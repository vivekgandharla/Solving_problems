import java.util.*;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter: ");
    System.out.print("Laude::::: ");
    int n = sc.nextInt();
    if(n < 0){
      System.out.print("Negetive ");
      if(n%2==0)
        System.out.println("Even");
      else
        System.out.println("Odd");
    }
    else if(n > 0){
      System.out.print("Positive ");
      if(n%2==0)
        System.out.println("Even");
      else
        System.out.println("Odd");
    }
    else 
      System.out.print("Zero");
    
  }
}
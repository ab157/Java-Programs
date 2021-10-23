import java.util.Scanner;
public class Floyd_Triangle{
  public static void main(String args[]){
      int n, num=1;
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the number of rows for Floyd's Triangle:");
      n=in.nextInt();

      System.out.println("Floyd's triangle:");

      for (int i=1 ; i <=n ; i++ ){
        for (int j=1 ; j <=i ; j++ ){
           System.out.print(num+" ");
           num++;
        }
        System.out.println();
      }
  }
}
import java.util.*;
class RecursiveSum{
    public static void main(String args[]){

        int sum,a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        sum=recadd(a,b);
        System.out.print("Sum of two numbers are:"+sum);}

    static int recadd(int a, int b)    //recursive method
    {
        if(b==0)
            return a;
        else
            return(1+recadd(a,b-1));   //rec call
    }
}
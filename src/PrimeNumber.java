import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean ans=false;
        int n= sc.nextInt();
       for(int i=2;i<n;i++)
       {
           if(n%i==0)
           {
               ans=false;
               break;

           }
           else
           {
               ans=true;
           }

    }
        if(ans)
        {
            System.out.println("prime");
        }
        else System.out.println("composite");
    }
}

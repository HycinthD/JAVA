


import java.util.Scanner;

public class prime {
    static boolean isprime(int num)
    {
        if(num<=1)
           return false;

        for (int i = 2;i<=num/2;i++)
        {
            if(num%i==0)
               return false;
        }
        return true;
    }
    public static void main(String[]args)
    {
        Scanner prime = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = prime.nextInt();

        if (isprime(num))
        {
            System.out.println(num +"is a prime number");

        }
        else{
            System.out.println(num +"is not a prime number");
        }
    }
    
}

public class Bit {
    public static void main(String[] args) {
        int a=2;
        int b= 7;
        System.out.println("AND Operation :" +(a & b));
        System.out.println("OR Operation: " +(a | b));
        System.out.println("XOR Operation: " +(a ^ b));
        System.out.println("NOT Operation of a: " + (~a));
        System.out.println("NOT Operation of b: " + (~b));
        int c=4;
        if((c & 1)==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
        //power of 2 write program
        int n=2;
        System.out.println("Power of 2: ");
        for(int i=1;i<=50;i++)
        {
            if((i &(i-1))==0)
            {
                System.out.println(i + " ");
            }
           
        }

    }
}
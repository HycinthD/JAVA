public class compliment {
    public static void main(String[] args) {
    int num = 10;
    int output = 0;

    for(int i = 0;i<32;i++)
    {
        int last = num & 1;

        if(output !=0)
        {
            output = output << 1;
        }
        if(last==1)
        {
            output = output | 1;
        }  
        num = num >>1;
    }
        System.out.println("Compliment of a number: " + output);
    }
    
}

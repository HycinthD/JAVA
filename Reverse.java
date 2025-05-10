public class Reverse {
    public static void main(String[] args) {
        
        int input = 2;
        int compliment = ~input;

        int mask = 0;
        while(mask < input)
        {
            mask = (mask<<1) | 1;
        }
        compliment = compliment & mask;
        System.out.println(compliment);
    }
    
    
}

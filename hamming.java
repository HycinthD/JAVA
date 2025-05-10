public class hamming {
    public static void main(String[] args) {
    int input = 16;
    int mask = 1;
    int counter = 0;

    for (int i =0; i<32 ;i++)
    {
        if((input & mask) !=0)
        {
            counter++;
        }
        mask = mask << 1;

    }
    
}
}

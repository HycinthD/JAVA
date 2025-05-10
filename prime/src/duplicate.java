public class duplicate {
    public static void main(String[] args) 
    {
        int[] numbers = {4,5,9,10,5};
        System.out.print("Duplicate elements are: ");
        for (int i = 0; i < numbers.length; i++)
         {
            for (int j = i + 1; j < numbers.length; j++) 
            {
            if (numbers[i] == numbers[j])
             {
                System.out.print(numbers[i] + " ");
                break;
            }
            }
        }
        System.out.println();
        }
        
    }
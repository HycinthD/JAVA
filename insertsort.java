public class insertsort {
    public static void main(String[] args) 
    {
        int[] arr = {3,5,7,24,63};
        int newNum = 53, n = arr.length;
        int[] newArr = new int[n + 1];
        int i = 0;
        while (i < n && arr[i] < newNum)
        {
            newArr[i] = arr[i];
            i++;
        }
        newArr[i] = newNum;
        while (i < n) 
        {
            newArr[i + 1] = arr[i];
            i++;
        }
        for (int num : newArr) System.out.print(num + " ");
    }
}

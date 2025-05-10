import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayOperations {
    private ArrayList<Integer> arr = new ArrayList<>();

    public void add(int index, int value) {
        if (index >= 0 && index <= arr.size()) 
        {
            arr.add(index, value);
        } 
        else
         {
            System.out.println("Invalid index");
        }
    }

    public void remove(int index)
     {
        if (index >= 0 && index < arr.size()) 
        {
            arr.remove(index);
        } else 
        {
            System.out.println("Invalid index");
        }
    }

    public int getSize()
    {
        return 
        arr.size();
    }

    public void rotate(int k)
     {
        int n = arr.size();
        if (n == 0) 
        return;
        k = k % n;
        Collections.rotate(arr, k);
    }

    public void shift(int k)
     {
        int n = arr.size();
        if (n == 0) 
        return;
        k = k % n;
        Collections.rotate(arr, -k);
    }

    public void display() 
    {
        System.out.println("Array: " + arr);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayOperations ops = new ArrayOperations();

        System.out.println("add,remove,size,rotate,shift,display,exit");

        while (true) 
        {
            System.out.print("\nEnter operation: ");
            String command = sc.next().toLowerCase();

            if (command.equals("add")) {
                System.out.print("index: ");
                int index = sc.nextInt();
                System.out.print("value: ");
                int value = sc.nextInt();
                ops.add(index, value);

            } else if (command.equals("remove")) {
                System.out.print("index: ");
                int index = sc.nextInt();
                ops.remove(index);

            } else if (command.equals("size")) {
                System.out.println("Size: " + ops.getSize());

            } else if (command.equals("rotate")) {
                System.out.print("rotate right: ");
                int k = sc.nextInt();
                ops.rotate(k);

            } else if (command.equals("shift")) {
                System.out.print("shift left: ");
                int k = sc.nextInt();
                ops.shift(k);

            } else if (command.equals("display")) {
                ops.display();

            } else if (command.equals("exit")) {
                System.out.println("Exit");
                break;

            } else {
                System.out.println("invalid");
            }
        }

        sc.close();
    }
}

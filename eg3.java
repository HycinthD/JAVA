import java.util.Scanner;
public class eg3 {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        String Name = info.nextLine();
        Double Score = info.nextDouble();
        info.nextLine();
        String Department = info.nextLine();
        System.out.println("Name:"+Name);
        System.out.println("Score:"+Score);
        System.out.println("Department:"+Department);
    }    
}

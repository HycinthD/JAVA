import java.util.HashMap;

public class hashmap{
    public static void main(String[] args) {
        HashMap<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("apple", 100);
        fruitPrices.put("orange", 50);
        fruitPrices.put("mango", 120);
        System.out.println("Apple: " + fruitPrices.get("apple"));
        System.out.println("orange: " + fruitPrices.get("orange"));
        System.out.println("Mango: " + fruitPrices.get("mango"));
    }
}

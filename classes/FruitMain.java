package classes;

public class FruitMain {
    public static void main(String[] args) {
        Fruit fruit = new Fruit("orange", "Spain", 0.45); 

        System.out.println(fruit + "\n");

        fruit.setName("banana"); 
        fruit.setOriginCountry("Guatemala");
        fruit.setPrice(1.00);

        System.out.println(fruit.getName());
        System.out.println(fruit.getOriginCountry());
        System.out.println(fruit.getPrice());
        System.out.println(fruit);
    }
}

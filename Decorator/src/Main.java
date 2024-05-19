public class Main {
    public static void main(String[] args) {
        BasePizza extraCheeseFarmHouse = new ExtraOnion(new ExtraCheese(new FarmHouse()));
        System.out.println(extraCheeseFarmHouse.cost());
    }
}
public class ExtraCheese implements PizzaTopping {
    BasePizza basePizza;
    ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}

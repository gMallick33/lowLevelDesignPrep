public class ExtraOnion implements PizzaTopping {

    BasePizza basePizza;
    ExtraOnion(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 5;
    }
}

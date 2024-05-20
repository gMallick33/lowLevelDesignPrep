public class Main {
    public static void main(String[] args) {
        AbstractColorFactory redFactory = new RedFactory();
        Shape redSquare = redFactory.getShape("SQUARE");
        redSquare.draw();
    }
}
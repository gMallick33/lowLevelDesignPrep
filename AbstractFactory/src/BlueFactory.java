public class BlueFactory implements AbstractColorFactory {

    @Override
    public Shape getShape(String typeofShape) {
        if(typeofShape.equals("SQUARE")) {
            return new BlueSquare();
        }
        else if(typeofShape.equals("CIRCLE")) {
            return new BlueCircle();
        }
        else return null;
    }
}

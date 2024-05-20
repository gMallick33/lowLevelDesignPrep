public class RedFactory implements AbstractColorFactory {

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equals("SQUARE")) {
            return new RedSquare();
        }
        else if(shapeType.equals("CIRCLE")) {
            return new RedCircle();
        }
        else return null;
    }
}

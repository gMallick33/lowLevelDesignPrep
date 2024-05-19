public class ShapeFactory {
    Shape getShape(String shape) {
        switch (shape) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}

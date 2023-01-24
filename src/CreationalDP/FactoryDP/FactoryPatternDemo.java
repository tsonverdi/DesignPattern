package CreationalDP.FactoryDP;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        Shape square = new Square();
        square.draw();
        Shape rectangle = new Rectangle();
        rectangle.draw();
        System.out.println("*********************\n");
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("daire");

        shape1.draw();


    }
}

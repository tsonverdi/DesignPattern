package CreationalDP.Abstract_FactoryDP;

public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shapeType){ //Kullanicidan hangi shape istedigimi istiyorum
        if (shapeType==null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")) {
            return new Rectangle();
        }
        return null;
    }
}

package CreationalDP.FactoryDP;

public class ShapeFactory {

    public Shape getShape(String shapeType){ //Kullanicidan hangi shape istedigimi istiyorum
        if (shapeType==null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("DAİRE")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("DİKTÖRTGEN")) {
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("KARE")) {
            return new Rectangle();
        }
        return null;
    }
}

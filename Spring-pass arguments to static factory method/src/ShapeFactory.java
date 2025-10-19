
public class ShapeFactory {

 public static Shape getShape(String shapeType) {

  if ("square".equals(shapeType)) {
   return new Square();
  } else if ("rectangle".equals(shapeType)) {
   return new Rectangle();
  } else if ("sircle".equals(shapeType)) {
   return new Circle();
  } else {
   return new Shape();
  }

 }

}
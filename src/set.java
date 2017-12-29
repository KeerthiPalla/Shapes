import java.util.ArrayList;
public class set {
  private String setName;
  private String description;
  private ArrayList<Shape> shapes = new ArrayList<Shape>();

  set(String setName,String description) {
    this.setName = setName;
    this.description = description;
  }

  // GETTER
  public String getDescription() {
    return description;
  }

  public String getSetName() {
    return setName;
  }

  public ArrayList<Shape> getShapes() {
    return shapes;
  }

  // SETTER
  public void setSetName(String setName) {
    this.setName = setName;
  }

  public void setShapes(ArrayList<Shape> shapes) {
    this.shapes = shapes;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  // add a shape
  public void addShape(Shape myShape) {
    shapes.add(myShape);
  }

  public void removeShape(Shape myShape) {
    for (int i = 0; i < shapes.size(); i++) {
      String shapeName = shapes.get(i).getShapeName();
      if (shapeName.equals(myShape.getShapeName())) {
        shapes.remove(i);
      }
    }
  }

  public void removeShape(String myShapeName) {
    for (int i = 0; i < shapes.size(); i++) {
      String shapeName = shapes.get(i).getShapeName();
      if (shapeName.equals(myShapeName)) {
        shapes.remove(i);
      }
    }
  }

  public double getCummulativeArea() {
    ArrayList<Shape> shapes = getShapes();
    double sum = 0;
    for(int i=0;i<shapes.size();i++) {
      Shape myShape = shapes.get(i);
      sum += myShape.getArea();
    }
    return sum;
  }

  public double getCummulativePerimeter() {
    ArrayList<Shape> shapes = getShapes();
    double sum = 0;
    for(int i=0;i<shapes.size();i++) {
      Shape myShape = shapes.get(i);
      sum += myShape.getPerimeter();
    }
    return sum;
  }

}


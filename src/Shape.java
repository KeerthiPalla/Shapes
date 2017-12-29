public class Shape implements Attributes
{
  private double radius;
  private String color = Constants.colors.BLACK.toString();
  private double length;
  private double width;
  private String shapeName;
  private double side;
  private String type;
 

  public Shape() {
  }
  Shape(String shapeName) {
    this.shapeName = shapeName;
  }

  // GETTERS
  public double getRadius() {
    return radius;
  }

  public String getColor() {
    return color;
  }

  public String getShapeName() {
    return shapeName;
  }

  public double getLength() {
    return length;
  }

  public double getWidth() {
    return width;
  }

  public double getSide() {
    return side;
  }

  public String getType() {
    return type;
  }

  // SETTERS
  public void setRadius(double radius) {
    this.radius = radius;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public void setShapeName(String shapeName) {
    this.shapeName = shapeName;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setSide(double side) {
    this.side = side;
  }

  // GET AREA
  public double getArea() {
    if (type.equals(Constants.shapeTypes.CIRCLE.toString())) {
      return Constants.PI * radius * radius;
    }
    if (type.equals(Constants.shapeTypes.RECTANGLE.toString())) {
      return length * width;
    }
    if (type.equals(Constants.shapeTypes.SQUARE.toString())) {
      return side * side;
    }
    return 0;
  }

  public double getPerimeter() {
    if (type.equals(Constants.shapeTypes.CIRCLE.toString())) {
      return 2 * Constants.PI * radius;
    }
    if (type.equals(Constants.shapeTypes.RECTANGLE.toString())) {
      return 2 * (length + width);
    }
    if (type.equals(Constants.shapeTypes.SQUARE.toString())) {
      return 4 * side;
    }
    return 0;
  }

}

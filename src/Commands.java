
public interface Commands{
	public void create_set(String setName, String description);
	public set getNoset();
	public void addShapeToSet(String setName, String shapeName);
	public void removeShapeFromNoSet(String shapeName);
	public void removeShapeFromSet(String setName, String shapeName);
	public void create_rectangle(String shapeName, double length, double width, String color);
	public void create_circle(String shapeName, double length, double width, String color);
	public void create_square(String shapeName, double length, double width, String color);
	public void addToNoSet(Shape myShape);
	public String getSetNameForTheShape(String myShapeName);
	public boolean doesShapeAlreadyExists(String myShapeName);
	 public boolean doesSetExists(String setName);
	 public boolean chkShapeConditions(String myShapeName);
	 public boolean chkSetConditions(String mySetName);
	 public void showSets();
	 public void showShapes();
	 public void showSetInfo(String setName);
	 public set getSet(String setName);
	 public Shape getShape(String shapeName);
	 public boolean isShapeExistsinSet(set mySet, Shape myshape);
	 public void deleteSet(String setName);
	 public void delteShape(String shapeName);
	 public void compareSet(String setName);
	 public void compareShape(String shapeName);
}
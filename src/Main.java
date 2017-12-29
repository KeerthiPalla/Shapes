import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class Main {
  public static ArrayList<set> set = new ArrayList<set>();
  public static Functions myFuns = new Functions();
 
  public static String translate_color(String s)
  {
      if( s.equals("black"))
          return Constants.colors.BLACK.toString();
      else if ( s.equals("blue"))
          return Constants.colors.BLUE.toString();
      else if ( s.equals("red"))  
          return Constants.colors.RED.toString();
      else if( s.equals("orange"))
          return Constants.colors.ORANGE.toString();
      else if ( s.equals("yellow"))
          return Constants.colors.YELLOW.toString();
      else if ( s.equals("green"))  
          return Constants.colors.GREEN.toString();      
      else if ( s.equals("indigo"))
          return Constants.colors.INDIGO.toString();
      else if ( s.equals("violet"))  
          return Constants.colors.VIOLET.toString();      
      else if ( s.equals("white"))  
          return Constants.colors.WHITE.toString();       
      return "";
  }
  
  public static void parse (String s)
  {
      String []tokens = s.split(" ");
      
      if(tokens[0].equals("create_set"))
      {
          myFuns.create_set(tokens[1], tokens[2]);
      }
      else if(tokens[0].equals("create_circle"))
      {
          myFuns.create_circle(tokens[1], Integer.parseInt(tokens[2]), translate_color(tokens[3]));
      }
      else if(tokens[0].equals("create_rectangle"))
      {
          myFuns.create_rectangle(tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]) , translate_color(tokens[4]));
      }
      else if(tokens[0].equals("create_square"))
      {
          myFuns.create_square(tokens[1], Integer.parseInt(tokens[2]), translate_color(tokens[3]));
      }
      else if(tokens[0].equals("add_shape_to_set"))
      {
        myFuns.addShapeToSet(tokens[1],tokens[2]);
      }
      else if(tokens[0].equals("show_sets"))
      {
           myFuns.showSets();
      }
      else if(tokens[0].equals("show_shapes"))
      {
           myFuns.showShapes();
      }
      else if(tokens[0].equals("remove_shape_from_set"))
      {   
          myFuns.removeShapeFromSet(tokens[1],tokens[1]);
      }
      else if(tokens[0].equals("delete_set"))
      {   
          myFuns.deleteSet(tokens[1]);
      }
      else if(tokens[0].equals("delete_shape"))
      {
          myFuns.delteShape(tokens[1]);
      }
  }
  
  public static void main(String[] args) throws IOException {

    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
    set.add(new set("NoSet",
        "This is default set, which consists of shapes which are not yet assigned"));
    
    
    String s = bufferRead.readLine();
    while( !s.isEmpty() )
    {
            parse(s);
	    s = bufferRead.readLine();
    }
    
  }
}


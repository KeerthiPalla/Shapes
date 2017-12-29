
public class Utils {
  public static boolean isAlpha(String name) {
    char[] chars = name.trim().replaceAll("\\s","").toCharArray();
    for (char c : chars) {
      if(!Character.isLetter(c)) {
        return false;
      }
    }
    return true;
  }
}


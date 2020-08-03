import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class parse {

  public static void main(String [] args) throws FileNotFoundException{
    parse();
  }

  public static void parse() throws FileNotFoundException {
    Scanner scanner = new Scanner(new File("example.in"));
    int vidNum = scanner.nextInt();
    int endNum = scanner.nextInt();
    int numReqDescrp = scanner.nextInt();
    int cacheNum = scanner.nextInt();
    int cacheSize = scanner.nextInt();
    System.out.println(vidNum + " " + endNum + " " + numReqDescrp + " " + cacheNum + " " + cacheSize);
    int[] vidSizes = new int[vidNum];
    for(int video = 0; video < vidNum; video++) {
      vidSizes[video] = scanner.nextInt();
    }
    System.out.println(Arrays.toString(vidSizes));
  }
}
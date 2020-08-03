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
    Video[] vids = new Video[vidNum];
    Endpoint[] endpoints = new Endpoint[endNum];
    // go throught the next line to get the size of all the videos
    for(int video = 0; video < vidNum; video++) {
      int size = scanner.nextInt();
      vids[video] = new Video(endNum, size);
    }
    System.out.println(Arrays.toString(vids));
    // we will then need to go through the information for each endpoint
    for(int end = 0; end < endNum; end++) {
      // the first line will tell you the datacenter latency and how many cache the endpoint is connected to
      int dataLat = scanner.nextInt();
      int cacheCount = scanner.nextInt();
      // then we need to get the latency for each cache its connected to
      int[] cacheLat = new int[cacheCount];
      for(int lat = 0; lat < cacheCount; lat++) {
        // the first int of this line is the number of the line
        int line = scanner.nextInt();
        cacheLat[line] = scanner.nextInt();
      }
      // then make the Endpoint object and add it to the class
      endpoints[end] = new Endpoint(cacheCount, dataLat, cacheLat);
    }
    // we can then go through the request information
    for(int req = 0; req < numReqDescrp; req++) {
      // set the request count
      // first comes the videos number
      int video = scanner.nextInt();
      // which endpoint is making the request
      int end = scanner.nextInt();
      // then is the requestion number
      vids[video].setRequest(end, scanner.nextInt());
    }
    System.out.println(Arrays.toString(vids));
    System.out.println(Arrays.toString(endpoints));
  }
}
import java.util.Arrays;

// a class that hold the infomation for each of the videos
public class Video {
  private int size;
  private int[] requests;

  public Video(int endNum, int size) {
    // make an array with the number of endpoints just so we can track how many requests are
    // made from each endpoint, might change how we store it later this was just easiest
    // the request array is the size of endNum and the endpoint number correspond to the 
    // position in the array and the value is the number of requests from that endpoint
    this.requests = new int[endNum];
    this.size = size;
  }

  public void setLatency(int endNum, int requestCount) {
    requests[endNum] = requestCount;
  }

  @Override
  public String toString() { 
      return "VIDEO size: " + size + ", requests: " + Arrays.toString(requests); 
  } 
}
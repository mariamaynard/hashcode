import java.util.Arrays;

// this is the class for each endpoint
public class Endpoint {
  private int[] latency;
  private int cacheNum;
  private int dataLatency;

  public Endpoint(int cacheNum, int dataLatency, int[] latency) {
    this.latency = latency;
    this.cacheNum = cacheNum;
    this.dataLatency = dataLatency;
  }

  @Override
  public String toString() { 
      return "ENDPOINT: Latency array: " + Arrays.toString(latency) + ", Cache num: " + cacheNum + ", Data Lat: " + dataLatency; 
  } 
}
package util;

import com.google.common.util.concurrent.RateLimiter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.stream.IntStream;

public class WriteToFile {

  public static void main(String[] args) throws IOException, InterruptedException {

    String logFile = args[0].split("=")[1];
    int numberOfRecordsPerSecond = Integer.parseInt(args[1].split("=")[1]);
    int maximumRecords = Integer.parseInt(args[2].split("=")[1]);
    String run = args[3].split("=")[1];

    System.out.println("Number of records per second: " + numberOfRecordsPerSecond);
    System.out.println("Maximum count: " + maximumRecords);
    System.out.println("Flushing to: " + logFile);
    System.out.println("Run string: " + run);

    RateLimiter rateLimiter = RateLimiter.create(numberOfRecordsPerSecond);
    BufferedWriter writer = new BufferedWriter(new FileWriter(logFile));
    System.out.println("\nProgress:");

    IntStream.range(0, maximumRecords).forEach(i -> {
      try {
        rateLimiter.acquire();
        writer.append(getPayload(i, run));
        writer.append("\n");
        writer.flush();
        System.out.print(i);
        System.out.print("\r");
      } catch (Exception e) {
        e.printStackTrace();
      }
    });

    writer.close();
  }

  private static String getPayload(int count, String run) {
    String timestamp = new Timestamp(System.currentTimeMillis()).toInstant().toString();
    return "{" +
        "\"event_timestamp\":\"" + timestamp + "\"," +
        "\"idx\":" + count + "," +
        "\"key\":\"value" + count + "\"," +
        "\"run\":\"" + run + "\"" +
        "}";
  }

}

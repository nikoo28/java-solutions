package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nikoo28 on 9/22/18 7:15 PM
 */

class LoggerRateLimiter {

  private Map<String, Integer> messageTime;

  public LoggerRateLimiter() {
    messageTime = new HashMap<>();
  }

  public boolean shouldPrintMessage(int timestamp, String message) {
    if (!messageTime.containsKey(message))
      return true;

    int lastTime = messageTime.get(message);
    if (timestamp - lastTime < 10) {
      messageTime.replace(message, timestamp);
      return false;
    }

    messageTime.replace(message, timestamp);
    return true;
  }

}

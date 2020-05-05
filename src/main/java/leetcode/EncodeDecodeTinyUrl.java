package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nikoo28 on 2019-07-20 17:36
 */

class EncodeDecodeTinyUrl {

  private Map<Integer, String> map = new HashMap<>();
  private int i = 0;

  public String encode(String longUrl) {
    map.put(i, longUrl);
    return "http://tinyurl.com/" + i++;
  }

  public String decode(String shortUrl) {
    return map.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/", "")));
  }

}

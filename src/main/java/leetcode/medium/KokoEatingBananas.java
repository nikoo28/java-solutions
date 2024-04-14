package leetcode.medium;

public class KokoEatingBananas {

  int minEatingSpeed(int[] piles, int h) {
    int minSpeed = 1;

    // Find max pile size
    int maxSpeed = 0;
    for (int pile : piles)
      maxSpeed = Math.max(maxSpeed, pile);

    // Binary search
    while (minSpeed < maxSpeed) {
      int mid = minSpeed + (maxSpeed - minSpeed) / 2;

      if (canEatInTime(piles, h, mid))
        maxSpeed = mid;
      else
        minSpeed = mid + 1;
    }

    return minSpeed;
  }

  private boolean canEatInTime(int[] piles, int h, int speed) {
    int hours = 0;
    for(int pile : piles)
      hours += (int) Math.ceil((double) pile / speed);

    return hours <= h;
  }

}

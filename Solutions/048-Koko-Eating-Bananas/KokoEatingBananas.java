public class KokoEatingBananas {

    public static int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = 0;

        for(int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            
            int speed = left + (right - left) / 2;

            long hours = 0;

            for (int pile : piles) {
                hours += (pile + speed - 1) / speed;
            }

            if (hours <= h) {
                right = speed;
            } else {
                left = speed + 1;
            }
        }

        return left;
    }
}
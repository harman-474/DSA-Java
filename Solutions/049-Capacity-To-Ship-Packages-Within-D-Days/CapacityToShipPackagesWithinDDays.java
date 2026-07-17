public class CapacityToShipPackagesWithinDDays {

    public static int shipWithinDays(int[] weights, int days) {

        int left = 0;
        int right = 0;

        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        while (left < right) {
            
            int capacity = left + (right - left) / 2;

            int daysNeeded = 1;
            int currentLoad = 0;

            for (int weight : weights) {

                if (currentLoad + weight > capacity) {
                    daysNeeded++;
                    currentLoad = 0;
                }

                currentLoad += weight;
            }

            if (daysNeeded <= days) {
                right = capacity;
            } else {
                left = capacity + 1;
            }
        }

        return left;
    }
}
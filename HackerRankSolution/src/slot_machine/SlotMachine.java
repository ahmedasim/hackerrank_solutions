package slot_machine;
public class SlotMachine {

	public static void main(String[] args) {
        int[][] dashboard = {
            {7,1,2},
            {2,4,6},
            {3,5,5},
            {3,1,2},
        };

        int spins = dashboard.length;
        int totalStops = 0;

        for (int spin = 0; spin < spins; spin++) {
            int minNumber = Integer.MAX_VALUE;
            int maxNumber = Integer.MIN_VALUE;

            for (int wheel = 0; wheel < dashboard[spin].length; wheel++) {
                minNumber = Math.min(minNumber, dashboard[spin][wheel]);
                maxNumber = Math.max(maxNumber, dashboard[spin][wheel]);
            }

            int stopsRequired = maxNumber - minNumber + 1; // Stops required for this spin
            totalStops += stopsRequired;
        }

        System.out.println("Minimum stops on each wheel for each spin:");
        for (int spin = 0; spin < spins; spin++) {
            System.out.println("Spin " + (spin + 1) + ": " + (dashboard[spin][0] - 1) + " stops");
        }

        System.out.println("\nTotal stops for " + spins + " spins: " + totalStops);
    }
}

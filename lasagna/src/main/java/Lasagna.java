public class Lasagna {
    private final int EXPECTED_OVEN_TIME_IN_MINUTES = 40;
    private final int PREPARATION_TIME_PER_LAYER_IN_MINUTES = 2;

    public int expectedMinutesInOven() {
        return EXPECTED_OVEN_TIME_IN_MINUTES;
    }

    public int remainingMinutesInOven(int timePassed) {
        return expectedMinutesInOven() - timePassed;
    }

    public int preparationTimeInMinutes(int noOfLayers) {
        return PREPARATION_TIME_PER_LAYER_IN_MINUTES * noOfLayers;
    }

    public int totalTimeInMinutes(int noOfLayers, int timePassed) {
        return preparationTimeInMinutes(noOfLayers) + timePassed;
    }
}

public class TrainPriceMultiplier {
    public static double getMultiplier(int hour, int minute){
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("Hour not valid");
        }
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Minute not valid");
        }

        double timeAtDay = hour +  ((double)minute / 60);

        if ( (timeAtDay >= 9.5 && timeAtDay <= 16) || timeAtDay > 19.5) {
            return .5;
        }
        return 1;
    }
}

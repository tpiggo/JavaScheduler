package scheduler.schedules;

public abstract class AbstractSchedule implements Schedule {

    private static long convertToMili(String timeIn){
        String [] split = timeIn.split(":");
        // in seconds
        long totalSeconds = 0;
        long max = 60 * 60;
        for (int i = 0; i < split.length; i++){
            int asInt = Integer.parseInt(split[i]);
            if (i != 0) {
                max = max / 60;
            }
            totalSeconds += asInt * max;
        }
        return totalSeconds * 1000;
    }

    protected abstract long getNextRun();

    public long nextRun() {
        return getNextRun();
    }
}

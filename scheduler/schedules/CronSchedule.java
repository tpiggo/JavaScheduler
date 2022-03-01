package scheduler.schedules;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import scheduler.Days;

public class CronSchedule implements Schedule {
    public static final long MAGIC=86400000L;
    private Days [] scheduledOn;
    private long time;
    private Calendar calendar = Calendar.getInstance();

    public CronSchedule(String time, Days ... days){
        scheduledOn = days;
        this.time = convertToMili(time);
    }

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

    private long getNextRun(Date aDate){
        calendar.setTime(aDate);
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        int maxDistance = 365;
        for (Days days: scheduledOn) {
            int distance = day - days.ordinal();
            if (Math.abs(distance) < maxDistance) {
                maxDistance = distance;
            }
        }
        return MAGIC - aDate.getTime()/MAGIC + maxDistance * MAGIC + this.time;
    }

    public long getNextRun(){
        Date aDate = new Date();
        long currentTime = aDate.getTime()/MAGIC;
        if (this.time > currentTime) {
            return currentTime - this.time;
        }
        return getNextRun(aDate);
    }

}

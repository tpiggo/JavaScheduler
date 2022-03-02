package scheduler;

import scheduler.schedules.CronSchedule;
import scheduler.schedules.IntervalSchedule;
import scheduler.schedules.Schedule;

public class SchedulerFactory {
    public static <T> SchedulerTask<T> createTask(String name, Task<T> input, Schedule aSched){
        return new SchedulerTask<T>(name, input, aSched);
    }

    public <T> SchedulerTask<T> createCronTask(String name, Task<T> input, CronSchedule aSched){
        return new SchedulerTask<T>(name, input, aSched);
    }

}

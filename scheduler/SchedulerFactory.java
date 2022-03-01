package scheduler;

import scheduler.schedules.CronSchedule;
import scheduler.schedules.IntervalSchedule;
import scheduler.schedules.Schedule;
import scheduler.tasks.CronTask;
import scheduler.tasks.IntervalTask;

public class SchedulerFactory {
    public static <T> SchedulerTask<T> createTask(String name, Task<T> input, Schedule aSched){
        if (aSched instanceof CronSchedule) {
            return new CronTask<T>(name, input);
        } else if (aSched instanceof IntervalSchedule){
            return new IntervalTask<T>(name, input);
        }
    }
}

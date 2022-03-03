package scheduler;
import scheduler.schedules.Schedule;

import java.time.LocalDate;


public class SchedulerTask<T> implements SchedulableTask {
    protected String taskName;
    protected Task<T> aTask;
    protected T lastOut;
    protected Schedule sched;

    public SchedulerTask(String name, Task<T> pTask, Schedule pSched) {
        this.taskName = name;
        this.aTask = pTask;
        this.sched = pSched;
    }

    public long nextRun(){
        return sched.nextRun();
    }

    public void run(){
        lastOut = aTask.run();
    }

    public String getName(){
        return taskName;
    }
}

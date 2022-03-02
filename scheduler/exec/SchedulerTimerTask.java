package scheduler.exec;

import scheduler.Task;

import java.util.TimerTask;

public class SchedulerTimerTask<T> extends TimerTask {
    Task <T> task;
    public SchedulerTimerTask(Task <T> task){
        super();
        this.task = task;
    }

    @Override
    public void run() {
            this.task.run();
    }
}

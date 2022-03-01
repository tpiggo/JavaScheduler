package scheduler.tasks;

import scheduler.SchedulerTask;
import scheduler.Task;
import scheduler.Type;

public class CronTask<T> extends SchedulerTask<T> {

    public CronTask(String name, Task<T> taskIn) {
        super(name, Type.CRON, taskIn);
    }

    @Override
    public void run() {

    }
}

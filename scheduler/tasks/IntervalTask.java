package scheduler.tasks;
import scheduler.Task;
import scheduler.SchedulerTask;
import scheduler.Type;

public class IntervalTask<T> extends SchedulerTask<T> {
    public IntervalTask(String name, Task<T> input) {
        super(name, Type.INTERVAL, input);
    }

    @Override
    public void run() {

    }
}

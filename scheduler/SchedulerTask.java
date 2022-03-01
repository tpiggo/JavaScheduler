package scheduler;
import java.time.LocalDate;


public abstract class SchedulerTask<T> implements SchedulableTask {
    protected String taskName;
    protected Type taskType;
    protected Task<T> aTask;
    protected T lastOut;
    private Integer nextRun;

    public SchedulerTask(String name, Type aType, Task<T> pTask) {
        this.taskName = name;
        this.taskType = aType;
        this.aTask = pTask;
    }

    public void run(){
        lastOut = aTask.run();
    }
}

package scheduler;

public class SchedulerTask implements SchedulableTask {
    private String taskName;
    private Type taskType;

    public SchedulerTask(String name, Type aType, String when) {
        this.taskName = name;
        this.taskType = aType;
        if (this.taskType == Type.CRON){
            this.createCronJob(when);
        }
    }

    private void createCronJob() {

    }

    public void run() {

    }

}

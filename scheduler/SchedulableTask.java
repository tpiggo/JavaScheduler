package scheduler;

public interface SchedulableTask {
    public void run();
    public long nextRun();
}

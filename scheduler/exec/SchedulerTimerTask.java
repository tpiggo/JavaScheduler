package scheduler.exec;

import scheduler.Scheduler;

import java.util.TimerTask;

public class SchedulerTimerTask extends TimerTask {
    Scheduler aScheduler;
    public SchedulerTimerTask(Scheduler pScheduler){
        super();
        aScheduler = pScheduler;
    }

    @Override
    public void run() {
            aScheduler.runNext();
    }
}

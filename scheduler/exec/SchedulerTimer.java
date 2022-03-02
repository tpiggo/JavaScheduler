package scheduler.exec;

import java.util.Timer;

public class SchedulerTimer extends Timer {
    public SchedulerTimer(){
        super();
    }

    public void schedule(SchedulerTimerTask aTask, long aDelay){
        super.schedule(aTask, aDelay);
    }
}

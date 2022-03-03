package scheduler;
import scheduler.exec.SchedulerTimer;
import scheduler.exec.SchedulerTimerTask;

import java.util.*;

public class Scheduler {
    private List<SchedulableTask> taskList;
    private HashMap<String, SchedulableTask> taskMap;
    private SchedulerTimer aTimer;
    private Calendar calendar = Calendar.getInstance();

    public Scheduler(JobStore jobStore, SchedulableTask ...tasks) {
        taskList = new ArrayList<>();
        aTimer = new SchedulerTimer();
        taskMap = new HashMap<>();
    }


    public void addTask(SchedulableTask task) {
        // TODO: add this task into the sorted task list!
        taskMap.put(getHashedId(), task);
        // taskList is a sorted list
        // insert it in the sorted list
        long nextRun = task.nextRun();


        long run = taskList.get(0).nextRun();
        aTimer.schedule(new SchedulerTimerTask(this), run);
    }

    private String getTimeFormatted() {
        return "";
    }


    private String getHashedId(){
        return "0";
    }

    public void runNext() {
        SchedulableTask t = taskList.remove(0);
        StringBuilder builder = new StringBuilder("Task ");
        builder.append(getTimeFormatted());
        builder.append(" running ");
        builder.append(t.getName());
        System.out.println(builder.toString());
    }

}

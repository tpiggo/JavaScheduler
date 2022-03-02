package scheduler;
import scheduler.exec.SchedulerTimer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Scheduler {
    List<SchedulableTask> taskList;
    HashMap<String, SchedulableTask> taskMap;
    SchedulerTimer aTimer;
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
    }



    private String getHashedId(){
        return "0";
    }

}

package Java.grundlagen.j7.collections.queueAndDeque.lab2;

import java.util.ArrayDeque;
import java.util.Deque;

public class Processing implements ProcessingInterface {

    private static Deque<Job> system = new ArrayDeque<>();

    public boolean addJob(Job job) {
        return system.offerLast(job);
    }

    public Job getNextJob() {
        return system.pollLast();
    }

    public void getJobBack(Job job) {
        system.offerLast(job);
    }

    public int getJobs() {
        return system.size();
    }

    public boolean hasJobs() {
        if (system.size() != 0) {
            return true;
        }
        return false;
    }
}

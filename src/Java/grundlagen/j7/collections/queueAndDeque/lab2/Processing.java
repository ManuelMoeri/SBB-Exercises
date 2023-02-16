package Java.grundlagen.j7.collections.queueAndDeque.lab2;

import Java.grundlagen.j7.collections.queueAndDeque.lab1.Job;
import Java.grundlagen.j7.collections.queueAndDeque.lab1.ProcessingInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class Processing implements ProcessingInterface {

    /**
     * Add a job to the system.
     *
     * @return true if the job is added.
     */
    private static Deque<Java.grundlagen.j7.collections.queueAndDeque.lab1.Job> system = new ArrayDeque<>();
    public boolean addJob(Java.grundlagen.j7.collections.queueAndDeque.lab1.Job job) {
        // TODO: implement this method
        return system.offerLast(job);
    }

    /**
     * Get the next job for processing.
     */
    public Java.grundlagen.j7.collections.queueAndDeque.lab1.Job getNextJob() {
        // TODO: implement this method
        return system.pollLast();
    }

    /**
     * Put the unprocessed job back to the system.
     */
    public void getJobBack(Job job) {
        // TODO: implement this method
        system.offerLast(job);
    }

    /**
     * Get the number of jobs in the system.
     */
    public int getJobs() {
        // TODO: implement this method
        return system.size();
    }

    /**
     * Has jobs in the system for processing?
     */
    public boolean hasJobs() {
        // TODO: implement this method
        if (system.size() != 0) {
            return true;
        }
        return false;
    }
}

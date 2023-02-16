package Java.grundlagen.j7.collections.queueAndDeque.lab2;

import Java.grundlagen.j7.collections.queueAndDeque.lab1.Job;

public interface ProcessingInterface {

    /**
     * Add a job to the system.
     * @return true if the job is added.
     */
    public boolean addJob(Java.grundlagen.j7.collections.queueAndDeque.lab1.Job job);

    /**
     * Get the next job for processing.
     */
    public Java.grundlagen.j7.collections.queueAndDeque.lab1.Job getNextJob();

    /**
     * Put the unprocessed job back to the system.
     */
    public void getJobBack(Job job);

    /**
     * Get the number of jobs in the system.
     */
    public int getJobs();

    /**
     * Has jobs in the system for processing?
     */
    public boolean hasJobs();
}

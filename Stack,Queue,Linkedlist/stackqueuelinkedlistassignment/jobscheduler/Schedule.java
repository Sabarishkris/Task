package stackqueuelinkedlistassignment.jobscheduler;

import java.util.PriorityQueue;

public class Schedule {
    private PriorityQueue<Job> jobQueue;
    private int waitingTime;
    private int turnaroundTime;

    public Schedule() {
        this.jobQueue = new PriorityQueue<>();
        this.waitingTime = 0;
        this.turnaroundTime = 0;
    }

    public void addJob(Job job) {
        jobQueue.add(job);
    }

    public void runScheduler() {
        while (!jobQueue.isEmpty()) {
            Job job = jobQueue.poll();
            System.out.println("\nProcessing Job " + job.getId() + " with priority " + job.getPriority() +
                    " and processing time " + job.getProcessingTime());
            waitingTime += turnaroundTime;
            turnaroundTime += job.getProcessingTime();
            System.out.println("Waiting Time: " + waitingTime + ", Turnaround Time: " + turnaroundTime);
        }
    }
}

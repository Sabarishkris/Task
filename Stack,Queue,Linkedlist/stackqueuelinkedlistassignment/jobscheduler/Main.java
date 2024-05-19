package stackqueuelinkedlistassignment.jobscheduler;

public class Main {


        public static void main(String[] args) {

            Schedule scheduler = new Schedule();

            scheduler.addJob(new Job(1, 6, 0));
            scheduler.addJob(new Job(2, 11, 15));
            scheduler.addJob(new Job(3, 4, 10));
            scheduler.addJob(new Job(3, 45, 1));
            scheduler.addJob(new Job(3, 4, 8));
            scheduler.addJob(new Job(5, 2, 3));

            scheduler.runScheduler();
        }

    }
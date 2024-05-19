package stackqueuelinkedlistassignment.jobscheduler;

    public class Job implements Comparable<Job> {
        private int id;
        private int processingTime;
        private int priority;

        public Job(int id, int processingTime, int priority) {
            this.id = id;
            this.processingTime = processingTime;
            this.priority = priority;
        }

        public int getId() {
            return id;
        }

        public int getProcessingTime() {
            return processingTime;
        }

        public int getPriority() {
            return priority;
        }

        public int compareTo(Job o) {
            return Integer.compare(o.priority, this.priority);
        }
    }

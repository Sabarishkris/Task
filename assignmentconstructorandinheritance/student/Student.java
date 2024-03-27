package assignmentconstructorandinheritance.student;


    public class Student {
        private String name;
        private String email;
        private long phoneNo;
        Student(String name,String email,long phoneNo){
            this.name=name;
            this.email=email;
            this.phoneNo=phoneNo;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public long getPhoneNo() {
            return phoneNo;
        }

        public void setPhoneNo(long phoneNo) {
            this.phoneNo = phoneNo;
        }
    }


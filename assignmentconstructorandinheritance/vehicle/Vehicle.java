package assignmentconstructorandinheritance.vehicle;


    abstract  class Vehicle {
        private String name;
        private String vehicleNo;
        abstract void vehicleModel();

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVehicleNo() {
            return vehicleNo;
        }

        public void setVehicleNo(String vehicleNo) {
            this.vehicleNo = vehicleNo;
        }
    }

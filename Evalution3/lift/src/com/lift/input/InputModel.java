package com.lift.input;

import com.lift.model.Lift;


public class InputModel {
    private InputView inputView;
    private static Lift lift;
    private static  int cap=20;
   private static int []liftCapacity={0,0,0,0,0};
    private final static int CAPACITY_WEIGHT = 1000;

    public InputModel(InputView inputView) {
        this.inputView = inputView;
        lift = new Lift();
    }

    public boolean checkCapacity(int persons) {
        if ((persons * 50) <= CAPACITY_WEIGHT) {
            return true;
        }
        return false;
    }
    public void assignLift( int currentFloor, int destinationFloor) {
        int []lifts=lift.getLift();
        int i = currentFloor >= 6 ? 2 : 0;
        int floorlimit = currentFloor >= 6 && destinationFloor == 0 ? 4 : 5;
        int max = Integer.MAX_VALUE;
        int index = -1;
        for (; i < floorlimit; i++) {
            int minpath = Math.abs(currentFloor - lifts[i]);
            if (max > minpath && lifts[i]!=-1 &&  liftCapacity[i] != cap) {
                max = minpath;
                index = i;
            }
        }
        if (index != -1) {
            lifts[index] = destinationFloor;
            liftCapacity[index]++;
            inputView.sendalart("L"+(index+1) +" assigned successfully ..!");
        }else{
            lifts[i]=-1;
        }

    }

    public void displayLift() {
        int[] lifts = lift.getLift();
        System.out.printf("%-5s %-5s %-5s %-5s %-5s", "L1", "L2", "L3", "L4", "L5");
        System.out.println();
        System.out.printf("%-5s %-5s %-5s %-5s %-5s", lifts[0], lifts[1], lifts[2], lifts[3], lifts[4]);
        System.out.println();


    }
}

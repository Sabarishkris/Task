package com.lift.input;

import com.lift.LiftApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputView {
    private InputModel inputModel;
    private Scanner scanner;

    public InputView() {
        inputModel = new InputModel(this);
        scanner=new Scanner(System.in);
    }

    public void init() {
        System.out.println("App Name : "+new LiftApp().getApp_Name());
        System.out.println("App Version : "+new LiftApp().getVersion());
        System.out.println("*****************************************************");
        start();
    }

    private void start() {
        inputModel.displayLift();
        try {
            System.out.println("Enter current floor : ");
            int currentFloor = scanner.nextInt();
            System.out.println("Enter designation floor : ");
            int designationFloor = scanner.nextInt();
            System.out.println("Enter no of person : ");
            int persons = scanner.nextInt();
            if (inputModel.checkCapacity(persons)) {
                inputModel.assignLift(currentFloor,designationFloor);
            } else {
                sendalart("20 persons only allowed !");
            }
        } catch (InputMismatchException e) {
            sendalart("Input mismatch ...!");

        }
    }

    public void sendalart(String s) {
        System.out.println(s);
        System.out.println("****************************");
        checkToBeContinue();
    }

    private void checkToBeContinue() {
        System.out.println("Enter yes for continue press any key for exit ");
        String choice=scanner.next();
        if(choice.equalsIgnoreCase("yes")){
            start();
        }else{
            System.out.println("Exiting....!");
        }
    }
}

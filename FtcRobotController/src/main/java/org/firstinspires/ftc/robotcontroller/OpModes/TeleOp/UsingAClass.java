package org.firstinspires.ftc.robotcontroller.OpModes.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class UsingAClass extends OpMode {

    double forwardAmount = gamepad1.left_stick_y; //This is a class member, it is only usable / recognized with in its class


    //check out this methode

    double squareMyNumber(double input) {
        double output = input * input;

        return output;
    }



    @Override
    public void init() {

    }




    @Override
    public void loop() {

        telemetry.addData("Press A on Ctroler 1", "To see the methode applied");
        telemetry.addData("Before Modifiyer", forwardAmount);


        if(gamepad1.a) {

            forwardAmount = squareMyNumber(forwardAmount);
        }
        else {
            forwardAmount = gamepad1.left_stick_y;
        }
        telemetry.addData("After Modifiyer", forwardAmount);
    }

}

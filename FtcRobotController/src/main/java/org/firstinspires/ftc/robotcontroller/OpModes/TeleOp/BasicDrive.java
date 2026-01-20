package org.firstinspires.ftc.robotcontroller.OpModes.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.hardware.HardwareMap;

@TeleOp
public class BasicDrive extends OpMode {



    @Override
    public void init() {
//How do I make it work like in blocks?


    }

    double frontRightMotor = gamepad1.left_stick_x;
    double frontLeftMotor = gamepad1.left_stick_x;
    double backLeftMotor = gamepad1.left_stick_x;
    double backRightMotor = gamepad1.left_stick_x;

    @Override
    public void loop() {

        telemetry.addData("Front Right Motor", frontRightMotor );
        telemetry.addData("Front Left Motor", frontLeftMotor );
        telemetry.addData("Back Right Motor", backRightMotor );
        telemetry.addData("Back Left Motor", backLeftMotor );


    }

}

package org.firstinspires.ftc.robotcontroller.mechanisms;
//i NEED TO DIGEST THIS CODE COMPLETLY, AND SEE HOW IT WORKS
import com.qualcomm.robotcore.hardware.DcMotor;
import  com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;
public class MotorHardwareTest {
    private DigitalChannel touchSensor;
    private DcMotor frontLeftMotor;
    private DcMotor frontRightMotor;
    private DcMotor backLeftMotor;
    private DcMotor backRightMotor;

public void init(HardwareMap hwMap) {

    touchSensor = hwMap.get(DigitalChannel.class, "touch_sensor");
    touchSensor.setMode(DigitalChannel.Mode.INPUT);

    //4 main motors bellow
    //IMPORTANT I need to custom set this to my 14____ rc C.H config
    frontLeftMotor = hwMap.get(DcMotor.class, "front_left_motor");
    frontRightMotor = hwMap.get(DcMotor.class, "front_right_motor");
    backLeftMotor = hwMap.get(DcMotor.class, "back_left_motor");
    backRightMotor = hwMap.get(DcMotor.class, "back_right_motor");

}
public boolean isTouchSensorPressed() {
    return !touchSensor.getState();
}
public void setMotorSpeed(double speed){
    frontLeftMotor.setPower(speed);
    frontRightMotor.setPower(speed);
    backLeftMotor.setPower(speed);
    backRightMotor.setPower(speed);

}

}

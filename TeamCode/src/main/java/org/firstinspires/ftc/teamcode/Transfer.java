package org.firstinspires.ftc.teamcode;

import com.pedropathing.ivy.Command;

import dev.nextftc.hardware.actuators.NextMotor;
import dev.nextftc.hardware.actuators.NextServo;
import dev.nextftc.robot.Mechanism;

public class Transfer implements Mechanism {
    public final NextMotor Intake = new NextMotor("Intake");
    public final NextMotor Transfer = new NextMotor("Transfer");
    public final NextServo Ramp = new NextServo("Ramp");


    double RampUp = 0.5;
    double RampDown = 0.1;

    public Command Run() {
        return instant(() -> {
            Intake.setThrottle(1.0);
            Transfer.setThrottle(1.0);
        });
    }

    public Command Reverse() {
        return instant(() -> {
            Intake.setThrottle(-1.0);
            Transfer.setThrottle(-1.0);
        });
    }

    public Command Stop() {
        return instant(() -> {
            Intake.setThrottle(0.0);
            Transfer.setThrottle(0.0);
        });
    }


    public Command RampUp() { return instant(() -> Ramp.setPosition(RampUp));}
    public Command RampDown() { return instant(() -> Ramp.setPosition(RampDown));}

}
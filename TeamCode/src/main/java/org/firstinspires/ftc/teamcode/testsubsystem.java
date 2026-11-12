package org.firstinspires.ftc.teamcode;

import com.pedropathing.ivy.Command;

import dev.nextftc.hardware.actuators.NextMotor;
import dev.nextftc.robot.Mechanism;

public class testsubsystem implements Mechanism {
    public final NextMotor FL = new NextMotor("motor");

    public Command run() {
        return instant(() -> FL.setThrottle(1.0));
    }
    public Command stop() {
        return instant(() -> FL.setThrottle(0));
    }
    public Command reverse() {
        return instant(() -> FL.setThrottle(-1));
    }

}
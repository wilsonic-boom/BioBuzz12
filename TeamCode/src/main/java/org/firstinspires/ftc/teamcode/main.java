package org.firstinspires.ftc.teamcode;

import dev.nextftc.robot.Telemetry;
import dev.nextftc.robot.opmode.NextOpMode;
import dev.nextftc.robot.opmode.NextTeleop;

@NextTeleop(name = "TESTa")
public class main extends NextOpMode {

    private final Robot robot;

    public main(Robot robot) {
        super(robot);
        this.robot = robot;
    }


    @Override
    public void periodic() {
        Telemetry.log("Status", "Running");
        if (gamepad1.xWasPressed()) {
            robot.testa.run().schedule();
        }

        if (gamepad1.aWasPressed()) {
            robot.testa.stop().schedule();
        }
        if (gamepad1.bWasPressed()) {
            robot.testa.reverse().schedule();
        }
    }
}
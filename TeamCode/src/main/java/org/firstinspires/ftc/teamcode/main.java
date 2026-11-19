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
    boolean RampUp = true;

    @Override
    public void start() {
        robot.Transfer.RampUp().schedule();
    }


    @Override
    public void periodic() {
        Telemetry.log("Status", "Running");
        if (gamepad1.xWasPressed()) {
            if (RampUp) {
                robot.Transfer.RampDown().schedule();
            } else {
                robot.Transfer.RampUp().schedule();
            }
        }

        if (gamepad1.right_trigger > 0.8) {
            robot.Shooter.Shoot();
        }



    }




}
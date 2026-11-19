package org.firstinspires.ftc.teamcode;

import com.pedropathing.ivy.Command;

import dev.nextftc.hardware.actuators.NextCRServo;
import dev.nextftc.hardware.actuators.NextMotor;
import dev.nextftc.hardware.actuators.NextServo;
import dev.nextftc.robot.Mechanism;

public class Shooter implements Mechanism {
    public final NextMotor Shooter1 = new NextMotor("Shooter1");
    public final NextMotor Shooter2 = new NextMotor("Shooter2");
    public final NextCRServo Turret1 = new NextCRServo("Turret1");
    public final NextCRServo Turret2 = new NextCRServo("Turret2");
    public final NextServo Hood = new NextServo("Hood");
    public final NextServo Gate = new NextServo("Gate");


    double GateClose = 0.5;
    double GateOpen = 0.1;


    @Override
    public void periodic() {
        Mechanism.super.periodic();
    }

   public void Shoot() {
       instant(() -> {
           Gate.setPosition(GateOpen);
       });
   }

    public Command GateOpen() { return instant(() -> Gate.setPosition(GateOpen));}
    public Command GateClose() { return instant(() -> Gate.setPosition(GateClose));}


}
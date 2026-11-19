package org.firstinspires.ftc.teamcode;

import java.util.Set;

import dev.nextftc.robot.Mechanism;
import dev.nextftc.robot.NextRobot;

public class Robot implements NextRobot {
    public final testsubsystem testa = new testsubsystem();
    public final Shooter Shooter = new Shooter();
    public final Transfer Transfer = new Transfer();


    public void periodic() {}
    public Set<Mechanism> getMechanisms() {
        return Set.of(testa,Shooter,Transfer);
    }
}
package frc.robot.commands.auton;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.fire;

public class Autonomous extends SequentialCommandGroup {

    public Autonomous() {
        addCommands(
                new autonDriveDistance(-48),
                new fire()
            );
    }
}
package frc.robot.commands;
import java.sql.Time;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.*;
public class wait extends CommandBase {
    public wait() {
    }
    @Override
    public void initialize() {
    }
    @Override
    public void execute() {
        Timer.delay(1);
    }
    @Override
    public void end(final boolean interrupted) {
        
    }
    @Override
    public boolean isFinished() {
        return false;
    }
}
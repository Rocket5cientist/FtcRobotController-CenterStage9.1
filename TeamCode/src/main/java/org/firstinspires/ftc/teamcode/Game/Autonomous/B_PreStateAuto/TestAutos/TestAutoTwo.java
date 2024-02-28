package org.firstinspires.ftc.teamcode.Game.Autonomous.B_PreStateAuto.TestAutos;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

import org.firstinspires.ftc.teamcode.Game.Autonomous.AutoControlsCombined;

@Disabled
@Autonomous(name = "TestAutoTWO")
public class TestAutoTwo extends AutoControlsCombined {

    @Override
    public void runOpMode() {
        initMethods(hardwareMap);
        robot.alliance = "red";
        switchToContourPipeline();
        waitForStart();
        sleep (5000);
        robot.intakeHoist.setPosition(hoist.stackPosition5);
        DriveAtAngleToStack(26, 0.35);  // Hit the stack
        //DriveShortDistance(-.2, .08); // back off a tiny bit
        intake.StartIntake(1);
        sleep(800);
        robot.intakeHoist.setPosition(hoist.stackPosition4);
        sleep(800);
        intake.StopIntake();
    }

}

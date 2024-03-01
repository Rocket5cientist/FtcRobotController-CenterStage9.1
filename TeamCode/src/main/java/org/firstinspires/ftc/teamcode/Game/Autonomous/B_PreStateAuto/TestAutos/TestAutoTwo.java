package org.firstinspires.ftc.teamcode.Game.Autonomous.B_PreStateAuto.TestAutos;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.AxesOrder;
import org.firstinspires.ftc.robotcore.external.navigation.AxesReference;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.Game.Autonomous.AutoControlsCombined;


@Autonomous(name = "DistanceSensors")
public class TestAutoTwo extends AutoControlsCombined {

    @Override
    public void runOpMode() {
        initMethods(hardwareMap);
        robot.alliance = "red";



        waitForStart();

        //Distance Sensor Telemetry
        while (opModeIsActive()) {

            telemetry.addData("leftDS", robot.leftDS.getDistance(DistanceUnit.INCH));
            telemetry.addData("rightDS", robot.rightDS.getDistance(DistanceUnit.INCH));
            telemetry.addData("backLeftDS", robot.backLeftDS.getDistance(DistanceUnit.INCH));
            telemetry.addData("backRightDS", robot.backRightDS.getDistance(DistanceUnit.INCH));
            telemetry.update();

        }


    }

}

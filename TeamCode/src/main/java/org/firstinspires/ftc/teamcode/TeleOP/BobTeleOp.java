package org.firstinspires.ftc.teamcode.TeleOP;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Utils.BobBase;

@TeleOp(name="BobTeleOp", group="Comp")
public class BobTeleOp extends LinearOpMode {

    BobBase robot = new BobBase();

    @Override
    public void runOpMode() {
        robot.init(hardwareMap);

        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        if (isStopRequested()) return; //stop execution if stopping is requested

        boolean scaleAdjusted = false;
        while (opModeIsActive()) {
            //Get Drive Inputs
            double x1 = gamepad1.left_stick_x;
            double y1 = -gamepad1.left_stick_y; // this is reversed! Y stick is reversed by default. We fix.
            double turn = gamepad1.right_stick_x;

            robot.drive.setPower(x1, y1, turn);

            double armAngle = -gamepad2.left_stick_y;
            double armExtend = gamepad2.right_stick_y;

            boolean uDpad = gamepad2.dpad_up;
            boolean dDpad = gamepad2.dpad_down;

            boolean lDpad = gamepad2.dpad_left;
            boolean rDpad = gamepad2.dpad_right;

            boolean xBtn = gamepad2.x;
            boolean aBtn = gamepad2.a;


            /*
            robot.armAngle.setPower(-gamepad2.left_stick_y);
            robot.armExtender.setPower(gamepad2.right_stick_y);
            */

        }
    }
}

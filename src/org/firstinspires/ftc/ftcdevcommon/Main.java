package org.firstinspires.ftc.ftcdevcommon;

import org.firstinspires.ftc.ftcdevcommon.platform.intellij.RobotLogCommon;
import org.firstinspires.ftc.ftcdevcommon.platform.intellij.WorkingDirectory;

public class Main {

    public static void main(String[] args) {
        RobotLogCommon.initialize(RobotLogCommon.LogIdentifier.TEST_LOG, WorkingDirectory.getWorkingDirectory() + "/logs/");
        System.out.println("Starting FTCDevCommonIntelliJ");
        RobotLogCommon.i("Main", "Starting FTCDevCommonIntelliJ");

        //##!! Follow the instructions in the README.

        System.out.println("Generating ftcdevcommon_2_4.jar");
        RobotLogCommon.i("Main", "Generating ftcdevcommon_2_4.jar");
        RobotLogCommon.closeLog();
    }
}

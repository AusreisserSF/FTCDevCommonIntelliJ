package org.firstinspires.ftc.ftcdevcommon;

import org.firstinspires.ftc.ftcdevcommon.intellij.WorkingDirectory;

public class Main {

    public static void main(String[] args) {
        RobotLogCommon.initialize(WorkingDirectory.getWorkingDirectory() + "/logs/");
        System.out.println("Starting FTCDevCommonIntelliJ");
        RobotLogCommon.i("Main", "Starting FTCDevCommonIntelliJ");
        System.out.println("Generating ftcdevcommon_1_2.jar");
        RobotLogCommon.i("Main", "Generating ftcdevcommon_1_2.jar");
        RobotLogCommon.closeLog();
    }
}

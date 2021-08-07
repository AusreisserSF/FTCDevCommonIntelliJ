package org.firstinspires.ftc.ftcdevcommon;

import org.firstinspires.ftc.ftcdevcommon.intellij.WorkingDirectory;

public class Main {

    public static void main(String[] args) {
        RobotLogCommon.initialize(WorkingDirectory.getWorkingDirectory() + "/logs/");
        System.out.println("Starting FTCDevCommonIntelliJ");
        RobotLogCommon.i("Main", "Starting FTCDevCommonIntelliJ");

        // Go into File -> Project Structure and rename the output directory and the
        // Output layout to the next release level of the jar file.

        System.out.println("Generating ftcdevcommon_1_5.jar");
        RobotLogCommon.i("Main", "Generating ftcdevcommon_1_5.jar");
        RobotLogCommon.closeLog();
    }
}

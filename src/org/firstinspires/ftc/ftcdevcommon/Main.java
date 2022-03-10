package org.firstinspires.ftc.ftcdevcommon;

import org.firstinspires.ftc.ftcdevcommon.intellij.RobotLogCommon;
import org.firstinspires.ftc.ftcdevcommon.intellij.WorkingDirectory;

public class Main {

    public static void main(String[] args) {
        RobotLogCommon.initialize(RobotLogCommon.LogIdentifier.TEST_LOG, WorkingDirectory.getWorkingDirectory() + "/logs/");
        System.out.println("Starting FTCDevCommonIntelliJ");
        RobotLogCommon.i("Main", "Starting FTCDevCommonIntelliJ");

        //##!! FIRST Go into File -> Project Structure -> Artifacts and change the
        // Name to the new version of the jar file. On the same screen change the
        // Output directory to reflect the new version and check the box for
        // Include in project build. Then right-click the actual name of the jar
        // file in the Output layout below and select Rename to rename the output
        // to the new version. Be sure to hit Enter on the new name before OK.

        System.out.println("Generating ftcdevcommon_2_0.jar");
        RobotLogCommon.i("Main", "Generating ftcdevcommon_2_0.jar");
        RobotLogCommon.closeLog();
    }
}

package org.firstinspires.ftc.ftcdevcommon.platform.intellij;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeStamp {

    // IntelliJ supports LocalDateTime
    public static String getLocalDateTimeStamp(LocalDateTime pLocalDateTime) {
        return pLocalDateTime.format(DateTimeFormatter.ofPattern("MMddHHmm'_'ssSSS"));
    }

}

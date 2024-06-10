package org.firstinspires.ftc.ftcdevcommon.platform.intellij;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeStamp {

    // IntelliJ supports LocalDateTime; format to 2024-06-06_0817:43.759.
    public static String getLocalDateTimeStamp(LocalDateTime pLocalDateTime) {
        return pLocalDateTime.format(DateTimeFormatter.ofPattern("yyyy'-'MM'-'dd'_'HHmm'-'ss'.'SSS"));
    }

}

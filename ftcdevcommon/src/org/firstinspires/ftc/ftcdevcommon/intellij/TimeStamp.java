package org.firstinspires.ftc.ftcdevcommon.intellij;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class TimeStamp {

    // IntelliJ supports LocalDateTime
    public static String getLocalDateTimeStamp(LocalDateTime pLocalDateTime) {
        return pLocalDateTime.format(DateTimeFormatter.ofPattern("MMddHHmm'_'ssSSS"));
    }

}

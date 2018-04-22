package edu.iis.mto.time;

import org.joda.time.DateTime;

public interface DateTimeSource {
    DateTime getCurrentDate();
    DateTime forwardTime(int hours);
}

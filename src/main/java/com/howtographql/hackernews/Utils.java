package com.howtographql.hackernews;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by bobdo on 8/12/2017.
 */
public class Utils {
    public static String getTimeStamp(long epoch) {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss.SSSS");
        TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
        sdf.setTimeZone(tz);
        return sdf.format(new Date(epoch));
    }
}

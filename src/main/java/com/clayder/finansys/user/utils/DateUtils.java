package com.clayder.finansys.user.utils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateUtils {

    public static Timestamp createTimeStamp(String strDate) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dateFormat.parse(strDate);
            return new Timestamp(date.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}

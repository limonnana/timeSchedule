package com.limonn.timer.businessLogic;

import com.limonn.timer.Utils;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class CalculateSchedule {

    @Autowired
    Utils utils;

    String out;
    String start;

    public String getOut(LocalDateTime trainTime){
        String result;
        LocalDateTime outTime = trainTime.minusMinutes(35);

        result = utils.fromTimeToString(outTime);
        return result;
    }

    public String getStart(LocalDateTime trainTime){
        String result;
        LocalDateTime outTime = trainTime.minusMinutes(55);

        result = utils.fromTimeToString(outTime);
        return result;
    }
}

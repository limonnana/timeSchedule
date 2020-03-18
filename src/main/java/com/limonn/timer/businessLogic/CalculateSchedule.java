package com.limonn.timer.businessLogic;

import com.limonn.timer.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class CalculateSchedule {

    @Autowired
    private Utils utils;

    private String out;
    private String start;
    private String trainTime;

    public String getOut(String trainTime){
        String result;
        LocalDateTime trainT= utils.fromStringTimeToTimeTrain(trainTime);
        LocalDateTime outTime = trainT.minusMinutes(35);

        result = utils.fromTimeToString(outTime);
        return result;
    }

    public String getStart(String trainTime){
        String result;
        LocalDateTime trainT= utils.fromStringTimeToTimeTrain(trainTime);
        LocalDateTime outTime = trainT.minusMinutes(50);

        result = utils.fromTimeToString(outTime);
        return result;
    }

    public String getTrainTimeFormated(String trainTime){
        return utils.trainTimeFormated(trainTime);
    }
}

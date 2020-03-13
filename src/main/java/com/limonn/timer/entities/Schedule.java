package com.limonn.timer.entities;

import com.limonn.timer.Utils;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class Schedule {



    private String train;
    private LocalDateTime trainTime;
    private String out;
    private LocalDateTime outTime;
    private String start;
    private LocalDateTime startTime;

    @Autowired
    private Utils utils;

    public Schedule(String train){
        this.train = train;
        this.trainTime = utils.fromStringTimeToTimeTrain(train);
        System.out.println(this.trainTime);
    }

    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train;
    }

    public LocalDateTime getTrainTime() {
        return trainTime;
    }

    public void setTrainTime(LocalDateTime trainTime) {
        this.trainTime = trainTime;
    }

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }

    public LocalDateTime getOutTime() {
        return outTime;
    }

    public void setOutTime(LocalDateTime outTime) {
        this.outTime = outTime;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }


}

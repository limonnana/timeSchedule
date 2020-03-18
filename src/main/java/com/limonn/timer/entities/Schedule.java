package com.limonn.timer.entities;

import com.limonn.timer.Utils;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class Schedule {



    private String train;
    private String out;
    private String start;


    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train;
    }

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }




}

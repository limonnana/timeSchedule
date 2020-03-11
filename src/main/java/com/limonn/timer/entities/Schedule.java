package com.limonn.timer.entities;

import java.time.LocalDateTime;

public class Schedule {



    private String train;
    private LocalDateTime trainTime;
    private String out;
    private LocalDateTime outTime;
    private String start;
    private LocalDateTime startTime;

    public Schedule(String train){
        this.train = train;
        this.setTrainTime(fromStringTimeToTimeTrain(train));
        System.out.println(this.trainTime.toString());
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

    LocalDateTime fromStringTimeToTimeTrain( String train){

        int hour = 0;

        int minutes = 0;

        int trainI = Integer.parseInt(train);

        if(trainI < 7 ){   // PM  no minutes 1, 2, 3 , 4, 5 , 7
            hour = trainI + 12;
        }
        if(trainI > 100 && trainI < 800) {  // PM with minutes 330 , 230
            String hourS = String.valueOf(trainI);
            String hourI = hourS.substring(0, 1);
            hour = Integer.parseInt(hourI) + 12;
            String minutesS = hourS.substring(1, 3);
            minutes = Integer.parseInt(minutesS);
        }

        if(trainI >7 && trainI < 13){   // AM  8, 9, 10, 11, 12
            hour = trainI;
        }

        if(trainI > 799 && trainI < 1030 ) { // AM 830, 930
            String hourS = String.valueOf(trainI);
            String hourI = hourS.substring(0, 1);
            hour = Integer.parseInt(hourI);
            String minutesS = hourS.substring(1, 3);
            minutes = Integer.parseInt(minutesS);
        }

        if(trainI > 1029 && trainI < 1300){ // 1030, 1130
            String hourS = String.valueOf(trainI);
            String hourI = hourS.substring(0, 2);
            hour = Integer.parseInt(hourI);
            String minutesS = hourS.substring(2, 4);
            minutes = Integer.parseInt(minutesS);
        }

        LocalDateTime localDateTime = LocalDateTime.now();
        String month = localDateTime.getMonth().toString();

        int day = localDateTime.getDayOfMonth();

        int year = localDateTime.getYear();

        LocalDateTime trainTime = LocalDateTime.of(year, localDateTime.getMonth(), day, hour, minutes);

        return trainTime;
    }
}

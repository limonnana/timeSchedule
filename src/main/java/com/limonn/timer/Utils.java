package com.limonn.timer;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Utils {

    public LocalDateTime fromStringTimeToTimeTrain(String train){

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

        LocalDateTime trainTime = getTime(hour, minutes);

        return trainTime;
    }


    public LocalDateTime getTime(int hour, int minutes){
        LocalDateTime localDateTime = LocalDateTime.now();

        String month = localDateTime.getMonth().toString();

        int day = localDateTime.getDayOfMonth();

        int year = localDateTime.getYear();

        LocalDateTime trainTime = LocalDateTime.of(year, localDateTime.getMonth(), day, hour, minutes);

        return trainTime;
    }

    public String fromTimeToString(LocalDateTime time){
        String result = "";

        String hour = time.getHour() + "";
        String minute = time.getMinute()+ "";
        if(minute.equals("0")){
            minute = "00";
        }
        int minuteI = Integer.parseInt(minute);
        if(minuteI < 10){
            minute = "0" + minute;
        }

        result = hour + ":" + minute;

        return result;
    }

    public String trainTimeFormated(String trainTime){

        LocalDateTime l = fromStringTimeToTimeTrain(trainTime);

        String formatedTime = fromTimeToString(l);

        int lenghtString = formatedTime.length();

        if(lenghtString > 4){
            formatedTime = formatedTime.substring(0, 5);
        }

        return formatedTime;
    }
}

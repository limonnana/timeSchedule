package com.limonn.timer.controller;

import com.limonn.timer.businessLogic.CalculateSchedule;
import com.limonn.timer.entities.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

@CrossOrigin(origins = "**", maxAge = 3600)
@RestController
public class MainController {

    @Autowired
    CalculateSchedule calculateSchedule;

    @GetMapping(value = "/getSchedule/{trainTime}")
    public Schedule getSchedule(@PathVariable("trainTime") String trainTime){

        String out = calculateSchedule.getOut(trainTime);
        String start = calculateSchedule.getStart(trainTime);
        String trainT = calculateSchedule.getTrainTimeFormated(trainTime);

        Schedule s = new Schedule();
        s.setTrain(trainT);
        s.setOut(out);
        s.setStart(start);

        return s;
    }

    public static void main(String[] args) {

       // Schedule s = new Schedule("10");
        /**
        LocalDateTime localDateTime = LocalDateTime.now();


        System.out.println(" localDateTime: " + localDateTime.toString());

        System.out.println(" localDateTime minus 15: " + localDateTime.minusMinutes(15).toString());

        String month = localDateTime.getMonth().toString();

        int day = localDateTime.getDayOfMonth();

        int year = localDateTime.getYear();

        System.out.println("day: " + day);

        System.out.println("Month: " + month);

        System.out.println("Year: " + year);

        LocalDateTime custom = LocalDateTime.of(year, localDateTime.getMonth(), day, 16, 30);

        System.out.println("Custom: " + custom);
         **/

    }
}

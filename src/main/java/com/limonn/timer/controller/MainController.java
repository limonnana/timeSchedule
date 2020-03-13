package com.limonn.timer.controller;

import com.limonn.timer.entities.Schedule;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

@CrossOrigin(origins = "**", maxAge = 3600)
@RestController
@RequestMapping("/timming")
public class MainController {

   // public Schedule getSchedule(){

  //  }

    public static void main(String[] args) {

        Schedule s = new Schedule("10");
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

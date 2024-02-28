package com.example.bookingservice.repository.service;

import com.example.bookingservice.model.Journey;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;

@Service
public interface JourneyRepoService {
    List<Journey> findByBoardingPointAndEndPoint(String boardingPoint, String endPoint);
    Journey findByBoardingPointAndEndPointAndStartTimeAndEndTime(String boardingPoint, String endPoint, LocalTime startTime, LocalTime endTime);


}

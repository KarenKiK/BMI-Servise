package ru.itpark.bmiservice.service;

import org.springframework.stereotype.Service;

@Service
public class BmiService {
  public double calculate(int weightInKg, int heightInSm) {
     double heightInM = heightInSm / 100.0;
     double bmi = weightInKg / (heightInM * heightInM);
     return bmi;
  }
}

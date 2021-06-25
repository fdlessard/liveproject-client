package io.fdlessard.liveproject.client;


import lombok.Data;

@Data
public class UserHealthData {

    private String username;
    private HealthMetricType healthMetricType;
    private double value;

}

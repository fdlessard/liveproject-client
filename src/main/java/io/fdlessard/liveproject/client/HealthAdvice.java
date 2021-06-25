package io.fdlessard.liveproject.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HealthAdvice {

    private String username;

    private String advice;


}
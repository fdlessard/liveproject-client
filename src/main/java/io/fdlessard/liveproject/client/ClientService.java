package io.fdlessard.liveproject.client;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class ClientService {

    private ResourceServerProxy resourceServerProxy;

    public String getAdvice() {
        return resourceServerProxy.getAdvice();
    }

    public void createHealthAdvices(List<UserHealthData> userHealthData) {
        userHealthData.forEach(u -> {
            HealthAdvice advice = getMockHealthAdvice(u.getUsername());
            resourceServerProxy.sendAdvice(List.of(advice));
        });
    }

    private HealthAdvice getMockHealthAdvice(String username) {
        HealthAdvice advice = new HealthAdvice();
        advice.setUsername(username);
        advice.setAdvice("Mock advice for " + username);
        return advice;
    }
}

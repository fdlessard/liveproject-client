package io.fdlessard.liveproject.client;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Data
@RestController
public class ClientController {

    private ClientService clientService;

    @GetMapping("/advice")
    public String get() {
        return clientService.getAdvice();
    }

    @PostMapping("/data")
    public void collectHealthDataForAdvice(@RequestBody List<UserHealthData> userHealthDatalist) {
        clientService.createHealthAdvices(userHealthDatalist);
    }
}
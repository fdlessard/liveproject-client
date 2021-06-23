package io.fdlessard.liveproject.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final ResourceServerProxy proxy;

    public TestController(ResourceServerProxy proxy) {
        this.proxy = proxy;
    }

    @GetMapping("/test")
    public String test() {
        return proxy.callDemo();
    }
}
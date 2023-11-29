package pro.jackynote.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/internal")
public class InternalAPIController {

    @GetMapping(value = "/health")
    public ResponseEntity internalHealthCheck() {
        return ResponseEntity.ok("ok");
    }
}

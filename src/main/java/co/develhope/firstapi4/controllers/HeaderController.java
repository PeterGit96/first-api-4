package co.develhope.firstapi4.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/headers")
public class HeaderController {

    @GetMapping
    public ResponseEntity<String> getHostInfo(@RequestHeader HttpHeaders headers) {
        return ResponseEntity.ok("hostName: " + headers.getHost().getHostName() + ", port: " + headers.getHost().getPort());
    }

}
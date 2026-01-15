package com.apps.controller;

import com.apps.dto.ApiResponse;
import com.apps.service.HelperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mic")
public class HelperController {

    @Autowired
    private HelperService helperService;

    @GetMapping("/publish")
    public ResponseEntity<ApiResponse> publish(@RequestBody String message) {
        ResponseEntity<ApiResponse> response = helperService.sendMessage(message);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);

        return new ResponseEntity<ApiResponse>(response.getBody(), headers, HttpStatus.OK);
    }

}

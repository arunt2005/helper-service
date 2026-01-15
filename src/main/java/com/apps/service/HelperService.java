package com.apps.service;

import com.apps.dto.ApiResponse;
import com.apps.feign.PublishServiceClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HelperService {

    private final PublishServiceClient publishClient;

    public HelperService(PublishServiceClient publishClient) {
        this.publishClient = publishClient;
    }

    public ResponseEntity<ApiResponse> sendMessage(String message) {
        return publishClient.publish(message);
    }
}

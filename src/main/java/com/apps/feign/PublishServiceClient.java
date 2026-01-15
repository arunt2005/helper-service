package com.apps.feign;

import com.apps.dto.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "publish-service")
public interface PublishServiceClient {
    @PostMapping("/api/messages/test/publish")
    ResponseEntity<ApiResponse> publish(@RequestBody String message);

}

package com.emazon.user_api_service.infrastructure.input;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/User")
@RequiredArgsConstructor
public class UserRestController {

    private final UserService userService;

    @GetMapping("/Form")
    public ResponseEntity<Map<String,String>> saveUser(){ return ResponseEntity.ok(userService.getForm());}


}
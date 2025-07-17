package com.devsuperior.dscatalog.resources;

import com.devsuperior.dscatalog.lib.dto.EmailDTO;
import com.devsuperior.dscatalog.services.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/auth")
public class AuthResource {

    private final AuthService authService;

    @PostMapping(value = "/recover-token")
    public ResponseEntity<Void> createRecoverToken(@Valid @RequestBody EmailDTO body){
        authService.createRecoverToken(body);
        return ResponseEntity.noContent().build();
    }

}

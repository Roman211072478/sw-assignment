package com.tourist.index.touristindex.application.rest;

import com.tourist.index.touristindex.application.models.CredentialsModel;
import com.tourist.index.touristindex.application.service.CredentialService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Log
@RestController
@RequestMapping(value = "/auth",  produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class CredentialController {
    private CredentialService credentialService;

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public ResponseEntity<CredentialsModel> createCredentials(final @Valid @RequestBody CredentialsModel body, HttpServletRequest request) {
        log.info("Start create user "+ System.currentTimeMillis());
        CredentialsModel response = credentialService.create(body);
        log.info("Completed create user "+ System.currentTimeMillis());
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public ResponseEntity<CredentialsModel> login(@PathVariable Long id ,final @RequestBody CredentialsModel body, HttpServletRequest request){
        log.info("Start login "+ System.currentTimeMillis());

        final CredentialsModel user = credentialService.login(body.getUsername(),body.getPassword());
        log.info("Completed login "+ System.currentTimeMillis());
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public ResponseEntity<String> deleteUser(final @PathVariable Long id,HttpServletRequest request) {
        credentialService.delete(id);
        return new ResponseEntity<>(id.toString(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}/update")
    public ResponseEntity<String> update(final @PathVariable Long id,@RequestBody CredentialsModel body, HttpServletRequest request) {
        credentialService.update(body,id);
        return new ResponseEntity<>(id.toString(), HttpStatus.OK);
    }
}

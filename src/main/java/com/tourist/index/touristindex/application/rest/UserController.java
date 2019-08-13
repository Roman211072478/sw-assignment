package com.tourist.index.touristindex.application.rest;

import com.tourist.index.touristindex.domain.models.User;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.ExecutionException;

@Log
@RestController
@RequestMapping(value = "/auth/user",  produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class UserController {

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public ResponseEntity<String> createUser(@RequestBody User body, HttpServletRequest request) {

//        String apiResponse = applicationDocumentService.createApplicationDocument(body, userId);

//        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<String> getUser(@PathVariable Long id, HttpServletRequest request){

//        String apiResponse = applicationDocumentService.createApplicationrequestDocument(body, userId);

//        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }
    @RequestMapping(method = RequestMethod.GET, value = "/findAll")
    public ResponseEntity<String> getAllUsers(HttpServletRequest request) {

//        String apiResponse = applicationDocumentService.createApplicationrequestDocument(body, userId);

//        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public ResponseEntity<String> deleteUser(final @PathVariable Long id,HttpServletRequest request) {

//        String apiResponse = applicationDocumentService.createApplicationrequestDocument(body, userId);

//        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public ResponseEntity<String> update(final @PathVariable Long id, HttpServletRequest request) {

//        String apiResponse = applicationDocumentService.createApplicationrequestDocument(body, userId);

//        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }
}

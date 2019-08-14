package com.tourist.index.touristindex.application.rest;

import com.tourist.index.touristindex.application.exceptions.UserNotFound;
import com.tourist.index.touristindex.application.models.PartialUser;
import com.tourist.index.touristindex.application.models.UserModel;
import com.tourist.index.touristindex.application.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Log
@RestController
@RequestMapping(value = "/auth/user",  produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public ResponseEntity<PartialUser> createUser(final @Valid @RequestBody UserModel body, HttpServletRequest request) {
        log.info("Start create user "+ System.currentTimeMillis());
        PartialUser response = userService.create(body);
        log.info("Completed create user "+ System.currentTimeMillis());
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<UserModel> getUser(@PathVariable Long id, HttpServletRequest request){
        log.info("Start get user "+ System.currentTimeMillis());

        final UserModel user = userService.findOne(id);
        log.info("Completed get user "+ System.currentTimeMillis());
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/findAll")
    public ResponseEntity<List<UserModel>> getAllUsers(HttpServletRequest request) {
        //need work

        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public ResponseEntity<String> deleteUser(final @PathVariable Long id,HttpServletRequest request) {
        userService.delete(id);
        return new ResponseEntity<>(id.toString(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public ResponseEntity<String> update(final @PathVariable Long id,@RequestBody UserModel body, HttpServletRequest request) {
        userService.update(body,id);
        return new ResponseEntity<>(id.toString(), HttpStatus.OK);
    }
}

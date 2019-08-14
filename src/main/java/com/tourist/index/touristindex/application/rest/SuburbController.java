package com.tourist.index.touristindex.application.rest;

import com.tourist.index.touristindex.application.models.PartialUser;
import com.tourist.index.touristindex.application.models.SuburbModel;
import com.tourist.index.touristindex.application.models.UserModel;
import com.tourist.index.touristindex.application.service.SuburbService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Log
@RestController
@RequestMapping(value = "/auth/suburb",  produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class SuburbController {

    private SuburbService suburbService;

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public ResponseEntity<SuburbModel> createSuburb(final @Valid @RequestBody SuburbModel body, HttpServletRequest request) {
        log.info("Start create suburb "+ System.currentTimeMillis());
        SuburbModel response = suburbService.create(body);
        log.info("Completed create suburb "+ System.currentTimeMillis());
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<SuburbModel> getSuburb(@PathVariable Long id, HttpServletRequest request){
        log.info("Start get user "+ System.currentTimeMillis());

        final SuburbModel user = suburbService.findOne(id);
        log.info("Completed get user "+ System.currentTimeMillis());
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/city/{id}")
    public ResponseEntity<SuburbModel> getSuburbByCityId(@PathVariable Long id, HttpServletRequest request){
        log.info("Start get user "+ System.currentTimeMillis());

        final SuburbModel user = suburbService.findOne(id);
        log.info("Completed get user "+ System.currentTimeMillis());
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/findAll")
    public ResponseEntity<List<SuburbModel>> getAllUsers(HttpServletRequest request) {
        //need work

        return new ResponseEntity<>(suburbService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public ResponseEntity<String> deleteUser(final @PathVariable Long id,HttpServletRequest request) {
        suburbService.delete(id);
        return new ResponseEntity<>(id.toString(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public ResponseEntity<String> update(final @PathVariable Long id,@RequestBody SuburbModel body, HttpServletRequest request) {
        suburbService.update(body,id);
        return new ResponseEntity<>(id.toString(), HttpStatus.OK);
    }
}

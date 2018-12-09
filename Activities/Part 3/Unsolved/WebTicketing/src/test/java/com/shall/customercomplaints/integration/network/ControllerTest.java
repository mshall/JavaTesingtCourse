package com.shall.customercomplaints.integration.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import com.shall.customercomplaints.repository.UsersRepository;

public class ControllerTest {

    @Autowired
    protected TestRestTemplate restTemplate;

    @Autowired
    protected UsersRepository usersRepository ;
    
    
    protected HttpEntity<Object> getHttpEntity(Object body) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new HttpEntity<Object>(body, headers);
    }
}

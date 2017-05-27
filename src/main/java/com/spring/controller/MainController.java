package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import static org.springframework.http.HttpStatus.OK;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import com.spring.model.ApiResponse;
import static com.spring.model.ApiStatus.success;

@Controller
@RequestMapping("/")
public class MainController {
    @RequestMapping(method = GET)
  public ResponseEntity<ApiResponse> greet(HttpServletRequest request) {
    return new ResponseEntity<>(new ApiResponse(success, "Welcome!"), OK);
  }
}
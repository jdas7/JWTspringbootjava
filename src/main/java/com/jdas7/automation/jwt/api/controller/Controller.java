package com.jdas7.automation.jwt.api.controller;

import com.jdas7.automation.jwt.api.entity.AuthRequest;
import com.jdas7.automation.jwt.api.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @Autowired
  private JwtUtil jwtUtil;
  @Autowired
  private AuthenticationManager authenticationManager;

  @GetMapping("/")
  public String newPage() {
    return "Welcomes";
  }

  @PostMapping("/authenticate")
  public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
    try {
      authenticationManager.authenticate(
          new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
      );
    } catch (Exception ex) {
      throw new Exception("inavalid username/password");
    }
    return jwtUtil.generateToken(authRequest.getUserName());
  }
}
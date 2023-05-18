package com.example.demo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullauth.api.enums.OauthResponseType;
import com.fullauth.api.service.FullAuthOauthService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloController {

	@GetMapping("/t")
	public String index() {
		log.info("Test 11");
		log.info("Test 2");
		log.info("Test 3");
		return "Greetings from Spring Boot with Demo Unified Flow!";
	}

    @GetMapping("/")
  	public Map<String, String> hello1(HttpServletResponse response) throws IOException {
		Map<String, String> data = new HashMap<>();
		data.put("key11", "value11");
		return  data;
	}

	@GetMapping("/login")
  	public void login(HttpServletResponse response) throws IOException {
		FullAuthOauthService service = FullAuthOauthService.builder(false)
					.clientId("6217f-583700ef70c738064b1a")
					.responseType(OauthResponseType.CODE)
					.scope("identity.profile")
					.redirectUri("http://localhost:8080/auth/cb")
					.useAppspot(true)
					.build();
		String authUrl = service.generateAuthorizationUrl();
		log.info("authUrl : {} ", authUrl);
		response.sendRedirect(authUrl);
	}

	@GetMapping("/auth/cb")
  	public Map<String, String> authCallBack(HttpServletResponse response) throws IOException {
		Map<String, String> data = new HashMap<>();
		data.put("auth_callback_success", "true");
		return  data;
	}

}
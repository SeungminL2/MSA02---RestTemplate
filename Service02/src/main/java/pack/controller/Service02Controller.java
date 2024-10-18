package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/lion")    // GatewayServer > application.yml > predicates
public class Service02Controller {
	
	@GetMapping("")
	public String f1() {
		System.out.println("서비스02 - f1()");
		return "라이언";
	}
}

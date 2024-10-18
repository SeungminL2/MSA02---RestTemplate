package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/tiger")    // GatewayServer > application.yml > predicates
public class Service01Controller {
	
	@Autowired
	RestTemplate rt;
	
	@GetMapping("")
	public String f1() {
		System.out.println("서비스01 - f1()");
		
		String result = rt.getForObject(
				"http://Service02/lion",    // Service02
				String.class
		);
		return "서비스01  >>  서비스02/lion : " + result;
	}
}

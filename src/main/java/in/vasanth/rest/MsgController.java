package in.vasanth.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	
	@GetMapping("/")
	public String getMsg() {
		return "Welcome to adventure";
	}

}
 
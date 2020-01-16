package com.zim.doctorWhoPart2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
@SpringBootApplication
public class DoctorWhoPart2Application {

	public static void main(String[] args) {
		SpringApplication.run(DoctorWhoPart2Application.class, args);
	}

	@RequestMapping("/doctor/{number}")
	@ResponseBody
	public String getMessage(@PathVariable int number, @RequestParam(defaultValue = "") String doctorName) {
		if (number <=8 && number >=1) {
			throw new ResponseStatusException(HttpStatus.SEE_OTHER);
		} else if (number > 13 || number < 1) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de récupérer l'incarnation " + number);
		} else if (number == 9){
			doctorName = "Christopher Eccleston";
		} else if (number == 10) {
			doctorName = "David Tennant";
		} else if (number == 11) {
			doctorName = "Matt Smith";
		} else if (number == 12) {
			doctorName = "Peter Capaldi";
		} else {
			doctorName = "Jodie Whittaker";
		}
		return "number : " + number + ", name : " + doctorName;

	}
}

package com.zim.doctorWho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DoctorWhoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorWhoApplication.class, args);
	}

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String index1() {
		return "William Hartnell";
	}
	@RequestMapping("/doctor/10")
	@ResponseBody
	public String index2() {
		return "David Tennant";
	}
	@RequestMapping("/doctor/8")
	@ResponseBody
	public String index3() {
		return "Paul McGann";
	}
	@RequestMapping("/doctor/13")
	@ResponseBody
	public String index4() {
		return "Jodie Whittaker";
	}
	@RequestMapping("/")
	@ResponseBody
	public String index5() {
		return "Here some Doctors : <ul>" +
				"<li><a href='http://localhost:8080/doctor/1'>William Hartnell</a></li>" +
				"<li><a href='http://localhost:8080/doctor/10'>David Tennant</a></li>" +
				"<li><a href='http://localhost:8080/doctor/8'>Paul McGann</a></li>" +
				"<li><a href='http://localhost:8080/doctor/13'>Jodie Whittaker</a></li>" +
				"</ul>";
	}


}

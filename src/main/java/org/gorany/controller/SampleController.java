package org.gorany.controller;

import org.gorany.domain.PartnerVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.java.Log;

@Controller
@Log
public class SampleController {

	@GetMapping("/login")
	public void login() {
		
	}
	
	@GetMapping("/welcome")
	public void welcome() {
		log.info("회원가입....");
	}
	
	@PostMapping("/partnercreate")
	public void partnercreate(PartnerVO vo) {
		log.info("파트너 계정생성 완료....");
		log.info("파트너 회원가입 정보: " + vo);
	}
}

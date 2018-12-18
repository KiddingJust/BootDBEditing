package org.gorany;

import org.gorany.domain.UserVO;
import org.gorany.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.Setter;
import lombok.extern.java.Log;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log
public class MapperTest {

	@Setter(onMethod_=@Autowired)
	private UserMapper mapper;
	
	@Test
	public void testGet() {
		log.info("" + mapper.getUserList());
	}
	
	
	@Test
	public void testRegister() {
			
		UserVO vo = new UserVO();
		vo.setNickname("gaaaaaik");
		vo.setEmail("rlarkdlr@bit.com");
		vo.setSns_id("193852034");
		vo.setStatus('0');
		
		log.info("" + mapper.registerUser(vo));
		
	}
	
	
}

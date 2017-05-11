package com.example;

import com.example.ntp.controller.Ntp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HwmApplicationTests {
	@Autowired
	Ntp ntp;

	@Test
	public void contextLoads() {
	}

	@Test
	public void ntpbean() {
		ntp.set("1.1.1.1");
		System.out.println(ntp.get());
	}

}

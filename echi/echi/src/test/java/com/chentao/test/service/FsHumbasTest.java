package com.chentao.test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.chentao.echi.po.FsHumbas;
import com.chentao.test.common.BaseTest;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@SpringBootConfiguration
@EnableAutoConfiguration
public class FsHumbasTest extends BaseTest{
	
	@Test
	public void getFsHumbasById() {
		FsHumbas fsHumbas = fsHumbasService.selectByPrimaryKey("0000934370");
		
		System.out.println(fsHumbas.getEmpNo());
	}

}

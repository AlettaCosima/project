package com.chentao.test.common;

import org.springframework.beans.factory.annotation.Autowired;

import com.chentao.echi.service.impl.FsHumbasServiceImpl;

public class BaseTest {
	
	@Autowired
	protected FsHumbasServiceImpl fsHumbasService;

}

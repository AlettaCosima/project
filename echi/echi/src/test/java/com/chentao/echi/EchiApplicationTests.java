package com.chentao.echi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.chentao.echi.po.FsHumbas;
import com.chentao.echi.service.impl.FsHumbasServiceImpl;
import com.github.pagehelper.PageInfo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EchiApplicationTests {
	
	@Autowired
	protected FsHumbasServiceImpl fsHumbasService;

	@Test
	public void contextLoads() {
		
		PageInfo<FsHumbas> pageInfo = fsHumbasService.selectByExamplePage(null, 1, 10);
		
		for(FsHumbas fs : pageInfo.getList()) {
			System.out.println("当前人才号为："+fs.getHumbasNo()); 
		}
		
		
	}

}

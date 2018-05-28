package com.chentao.echi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chentao.echi.dao.impl.FsHumbasDaoImpl;
import com.chentao.echi.po.FsHumbas;
import com.chentao.echi.po.FsHumbasExample;
import com.chentao.echi.service.FsHumbasService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("fsHumbasService")
public class FsHumbasServiceImpl implements FsHumbasService{
	
	@Autowired
	private FsHumbasDaoImpl fsHumbasDao;

	@Override
	public List<FsHumbas> selectByExample(FsHumbasExample example) {
		List<FsHumbas> list = fsHumbasDao.selectByExample(null);
		return list;
	}

	@Override
	public FsHumbas selectByPrimaryKey(String humbasNo) {
		FsHumbas fsHumbas = fsHumbasDao.selectByPrimaryKey(humbasNo);
		return fsHumbas;
	}

	@Override
	public PageInfo<FsHumbas> selectByExamplePage(FsHumbasExample example, Integer startNum, 
			Integer pageSize) {
		
		PageHelper.startPage(startNum, pageSize);
		
		List<FsHumbas> list = fsHumbasDao.selectByExample(null);
		
		PageInfo<FsHumbas> pageInfo = new PageInfo<FsHumbas>(list);
		
		return pageInfo;
	}

}

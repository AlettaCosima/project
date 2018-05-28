package com.chentao.echi.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.chentao.echi.common.BaseDao;
import com.chentao.echi.mapper.FsHumbasMapper;
import com.chentao.echi.po.FsHumbas;
import com.chentao.echi.po.FsHumbasExample;
import com.github.pagehelper.Page;

@Repository
public class FsHumbasDaoImpl extends BaseDao<FsHumbas> implements FsHumbasMapper{

	@Override
	public long countByExample(FsHumbasExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(FsHumbasExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(String humbasNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(FsHumbas record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(FsHumbas record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<FsHumbas> selectByExample(FsHumbasExample example) {
		return getSqlSession().selectList("selectByExample", example);
	}

	@Override
	public FsHumbas selectByPrimaryKey(String humbasNo) {
		return getSqlSession().selectOne("selectByPrimaryKey", humbasNo);
	}

	@Override
	public int updateByExampleSelective(FsHumbas record, FsHumbasExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(FsHumbas record, FsHumbasExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(FsHumbas record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(FsHumbas record) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}

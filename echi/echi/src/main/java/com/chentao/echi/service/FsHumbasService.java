package com.chentao.echi.service;

import java.util.List;

import com.chentao.echi.po.FsHumbas;
import com.chentao.echi.po.FsHumbasExample;
import com.github.pagehelper.PageInfo;

public interface FsHumbasService {
	
	List<FsHumbas> selectByExample(FsHumbasExample example);
	
	FsHumbas selectByPrimaryKey(String humbasNo);
	
	/**
	 * 分页方法:根据实际传参、当前页、结束页、每页记录数
	 * @param example
	 * @return 返回实际的数据及分页数据
	 */
	PageInfo<FsHumbas> selectByExamplePage(FsHumbasExample example,Integer startNum,Integer pageSize);

}

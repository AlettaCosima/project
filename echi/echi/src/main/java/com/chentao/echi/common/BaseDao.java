package com.chentao.echi.common;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public abstract class BaseDao<T>  extends SqlSessionDaoSupport {
	
	@Resource(name = "sqlSessionFactory")  
    private SqlSessionFactory sqlSessionFactory; 
	
	protected SqlSession sqlSession;
	
	@PostConstruct  
    public void SqlSessionFactory() {  
        super.setSqlSessionFactory(sqlSessionFactory);  
    }
	
	public SqlSession getSqlSession(){
		sqlSession =  sqlSessionFactory.openSession();
		return sqlSession;
	}
	
}
 
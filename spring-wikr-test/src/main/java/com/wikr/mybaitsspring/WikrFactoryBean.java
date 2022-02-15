//package com.wikr.mybaitsspring;
//
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.springframework.beans.factory.FactoryBean;
//import org.springframework.beans.factory.annotation.Autowired;
//
///**
// * @Author: xyt
// * @Date: 2022/2/15 17:48
// * @version: 1.0.0
// */
//public class WikrFactoryBean implements FactoryBean {
//
//	private Class mapperInterface;
//
//	private SqlSession sqlSession;
//
//	public WikrFactoryBean(Class mapperInterface){
//		this.mapperInterface = mapperInterface;
//	}
//
//	@Autowired
//	public void setSqlSession(SqlSessionFactory sqlSessionFactory){
//		sqlSessionFactory.getConfiguration().addMapper(mapperInterface);
//		// Meta- 创建DefaultSqlSession
//		this.sqlSession = sqlSessionFactory.openSession();
//	}
//
//	@Override
//	public Object getObject() throws Exception {
//
//		return sqlSession.getMapper(mapperInterface);
//	}
//
//	@Override
//	public Class<?> getObjectType() {
//		return mapperInterface;
//	}
//}

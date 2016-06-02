package com.imooc.db;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 取得SqlSession
 *
 */
public class DBAccess {
	//异常抛dao层处理
	public SqlSession getSqlSession() throws IOException {
//		读取配置文件。
		Reader reader = Resources.getResourceAsReader("com/imooc/config/Configuration.xml");
//		构建一个SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//		打开一个SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		return sqlSession;

	}
}

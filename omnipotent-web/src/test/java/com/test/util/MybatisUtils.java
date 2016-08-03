package com.test.util;

import java.io.InputStream;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 测试工具类
 * 
 * @author zhangtb
 * @date 2015年5月19日16:46:21
 * @since 1.0.0
 */
public class MybatisUtils {
	
	// 每一个MyBatis的应用程序都以一个SqlSessionFactory对象的实例为核心
	// 使用SqlSessionFactory的最佳实践是在应用运行期间不要重复创建多次,最佳范围是应用范围
	private final static SqlSessionFactory sqlSessionFactory;
	
	static {
		String resource = "mybatis-config.xml";
		InputStream inputStream = MybatisUtils.class.getClassLoader().getResourceAsStream(resource);
		// SqlSessionFactory对象的实例可以通过SqlSessionFactoryBuilder对象来获得
		// SqlSessionFactoryBuilder实例的最佳范围是方法范围（也就是本地方法变量）。
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	
	public static SqlSession getSqlSession() {
		SqlSession session = getSqlSessionFactory().openSession();
		return session;
	}
	
	public static void close() {
		getSqlSession().close();
	}
	
	public static void closeSqlSession(SqlSession session) {
		session.close();
	}
	
	public static void main(String[] args) {
		SqlSession session = MybatisUtil.getSqlSession();
		System.out.println(session);
		MybatisUtil.closeSqlSession(session);
	}

}

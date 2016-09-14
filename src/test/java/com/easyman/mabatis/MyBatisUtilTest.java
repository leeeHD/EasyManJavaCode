package com.easyman.mabatis;

import com.easyman.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Assert;
import org.junit.Test;

public class MyBatisUtilTest {

	@Test
	public void testConnection() {
		SqlSessionFactory factory = MyBatisUtil.getFactory();
		Assert.assertNotNull(factory);
	}
}

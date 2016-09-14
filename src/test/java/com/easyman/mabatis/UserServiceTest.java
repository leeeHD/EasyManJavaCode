package com.easyman.mabatis;

import static org.junit.Assert.*;

import com.easyman.db.mybatis.service.UserService;
import com.easyman.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class UserServiceTest {
	private UserService userService;

	@Before
	public void setUp() throws Exception {
		userService = new UserService();
	}

	@After
	public void tearDown() throws Exception {
		// 删除所有插入的数据后退出
	}

	@Test
	public void testInsert() {
		long insert = insertAnItem();
		assertTrue(insert > 0);
	}

	@Test
	public void testDelete() {
//		+---------+-------------+----------+------------+-----------+
//		| user_id | email_id    | password | first_name | last_name |
//		+---------+-------------+----------+------------+-----------+
//		|       1 | el@rodo.com | eldorado | tony       | andy      |
//		+---------+-------------+----------+------------+-----------+
		userService.delete(1);
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindUser() {
		User user = userService.findUser(1);
		assertEquals("el@rodo.com", user.getEmail_id());
		assertEquals("tony", user.getFirst_name());
		assertEquals("eldorado", user.getPassword());
	}

	@Test
	public void testFindAllUsers() {
		fail("Not yet implemented");
	}

	private long insertAnItem() {
		User user = new User();
		user.setEmail_id("el@rodo.com");
		user.setFirst_name("andy");
		user.setLast_name("dany");
		user.setPassword("eldorado");
		long insert = userService.insert(user);
		return insert;
	}
}

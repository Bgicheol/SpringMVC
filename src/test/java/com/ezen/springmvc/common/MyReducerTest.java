package com.ezen.springmvc.common;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
public class MyReducerTest {
		
	//MyReducer reducer = new MyReducer_imp1();
	
	// Autowired 를 사용하기 위해서는 설정을 추가해야 사용이 가능하다. Component를 설정해도 안됨.
	@Autowired
	MyReducer reducer;
	
	@Before
	public void test0() {
		System.out.println(reducer);
	}
	
	@Test
	public void test1() {
		assertEquals(Integer.valueOf(150), reducer.reduce(new Integer[] {10, 20, 30, 40, 50}));
	}
	
	@Test
	public void test2() {
		assertEquals(Integer.valueOf(120), reducer.reduce(new Integer[] {10, 20, null, 40, 50}));
	}
	
	@Test
	public void test3() {
		assertEquals(Integer.valueOf(0), reducer.reduce(new Integer[] {null, null, null}));
	}
}

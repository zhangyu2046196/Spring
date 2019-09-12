package com.youyuan.spring.jdbc.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class JdbcTemplateTest {
	
	private static ApplicationContext ctx=null;
	private static JdbcTemplate jdbcTemplate=null;
	private static NamedParameterJdbcTemplate namedParameterJdbcTemplate=null;
	
	static{
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		jdbcTemplate=(JdbcTemplate) ctx.getBean("jdbcTemplate");
		namedParameterJdbcTemplate=(NamedParameterJdbcTemplate) ctx.getBean("namedParameterJdbcTemplate");
	}
	

	@Test
	public void test() {
		System.out.println("ctx"+ctx);
		System.out.println("jdbcTemplate"+jdbcTemplate);
	}
	
	/**
	 * 测试批量添加
	 */
	@Test
	public void testBatchUpdate(){
		String sql="insert into EMPLOYEE (USER_NAME,GENDER,EMAIL,DEPARTMENT_ID) values {?,?,?,?}";
		List<Object[]> list=new ArrayList<>();
		list.add(new Object[]{"datun","1","dat@youyuan.tech.com",1L});
		//list.add(new Object[]{"jinrongjie","0","jinrongj@youyuan.tech.com",2L});
		jdbcTemplate.batchUpdate(sql, list);
	}
	
	/**
	 * 测试更新方法
	 */
	@Test
	public void testUpdate(){
		String sql="update EMPLOYEE set USER_NAME=? where GUID=?";
		jdbcTemplate.update(sql, "大屯",13L);
	}
	
	/**
	 * 查询一条记录
	 */
	@Test
	public void testQuery(){
		String sql="select * from EMPLOYEE where GUID=?";
		RowMapper<Employee> rowMapper=new BeanPropertyRowMapper<>(Employee.class); 
		Employee emp=jdbcTemplate.queryForObject(sql, rowMapper, 1L);
		System.out.println(emp);
	}
	
	/**
	 * 查询多条记录
	 */
	@Test
	public void testQueryList(){
		String sql="select * from EMPLOYEE where GUID>?";
		RowMapper<Employee> rowMapper=new BeanPropertyRowMapper<>(Employee.class);
		List<Employee> empList=jdbcTemplate.query(sql, rowMapper, 1L);
		System.out.println(empList);
	}
	
	/**
	 * 删除一条记录
	 */
	@Test
	public void testDel(){
		String sql="delete from EMPLOYEE where GUID=?";
		jdbcTemplate.update(sql, 13L);
	}
	
	/**
	 * 添加一条
	 */
	@Test
	public void testAdd(){
		String sql="insert into EMPLOYEE (USER_NAME,GENDER,EMAIL) values (?,?,?)";
		jdbcTemplate.update(sql, "东单","1","dongd@youyuan.teh.com");
	}
	
	/**
	 * NamedParameterJdbcTemplate(具名参数)
	 * 可以为参数起名字, 不用?作为占位符
	 * 优点:可以为参数请名字,在多参数的情况下,比?占位符清晰,不容易混乱
	 * 缺点:开发工作量比JdbcTemplate大
	 */
	@Test
	public void testNamedParameterJdbcTemplate(){
		String sql="insert into EMPLOYEE (USER_NAME,GENDER,EMAIL,DEPARTMENT_ID) values (:userName,:gender,:email,:departmentId)";
		Map<String, Object> paramMap=new HashMap<String, Object>();
		paramMap.put("userName", "金融街");
		paramMap.put("gender", "1");
		paramMap.put("email", "wudak@youyuan.com");
		paramMap.put("departmentId", 2L);
		namedParameterJdbcTemplate.update(sql, paramMap);
	}
	
	/**
	 * NamedParameterJdbcTemplate(具名参数),传递实体
	 * 参数可以作为一个实体传递,要求实体的属性名和命名的参数名要一致
	 */
	@Test
	public void testNamedParameterJdbcTemplate2(){
		String sql="insert into EMPLOYEE (USER_NAME,GENDER,EMAIL,DEPARTMENT_ID) values (:userName,:gender,:email,:deptId)";
		Employee emp=new Employee();
		emp.setUserName("双井");
		emp.setGender("0");
		emp.setEmail("shuangj@youyuan.com");
		emp.setDeptId(3L);
		SqlParameterSource paramSource=new BeanPropertySqlParameterSource(emp);
		namedParameterJdbcTemplate.update(sql, paramSource);
	}

}

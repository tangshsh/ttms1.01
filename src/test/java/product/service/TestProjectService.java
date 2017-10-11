package product.service;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import cn.tedu.ttms.common.service.ProjectService;

import cn.tedu.ttms.product.entity.Project;

public class TestProjectService {
	ClassPathXmlApplicationContext ctx;
	@Before
	public void init(){
		ctx = new ClassPathXmlApplicationContext("spring-mvc.xml","spring-mybatis.xml");
		
	}
	@Test
	public void testFindObject(){
		//1.获得ProjectService对象
		ProjectService projectService = ctx.getBean("projectServiceImpl",ProjectService.class);
		//2.执行ProjectService对象的findObject方法
		List<Project> list = projectService.FindObject();
		//3.验证结果是否正确
		Assert.assertNotEquals(0, list.size());
		//4.输出执行结果
		System.out.println(list);
	}
	@After
	public void destory(){
		
	}

}

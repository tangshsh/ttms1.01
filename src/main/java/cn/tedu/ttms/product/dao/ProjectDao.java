package cn.tedu.ttms.product.dao;

import java.util.List;

import cn.tedu.ttms.product.entity.Project;

/**项目模块持久层对象*/
public interface ProjectDao {
	/**获取所有项目信息*/
	List<Project> FindObjects();

}

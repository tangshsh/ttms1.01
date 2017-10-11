package cn.tedu.ttms.common.service;

import java.util.List;

import cn.tedu.ttms.product.entity.Project;

/**
 * 项目管理业务层借口对象
 * 1)负责业务处理
 * 2)负责事务处理
 * 3)负责日志处理
 * 4)负责缓存处理
 * 5)负责权限处理
 * 6）···
 *
 */
public interface ProjectService {
	/**查询所有项目信息*/
	List<Project> FindObject();

}

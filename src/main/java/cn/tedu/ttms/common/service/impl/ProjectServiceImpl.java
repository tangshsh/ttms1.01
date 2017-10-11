package cn.tedu.ttms.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.ttms.common.service.ProjectService;
import cn.tedu.ttms.product.dao.ProjectDao;
import cn.tedu.ttms.product.entity.Project;
@Service
public class ProjectServiceImpl implements ProjectService{
	@Autowired
	private ProjectDao projectDao;

	@Override
	public List<Project> FindObject() {
	    List<Project> list = projectDao.FindObjects();
		return list;
	}

}

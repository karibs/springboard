package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.service.ProjectService;
import com.project.service.dao.ProjectDAO;
import com.project.vo.ProjectVO;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectDAO projectMapper;

	@Override
	@Transactional
	public List<ProjectVO> selectProjectList() throws Exception {
		return projectMapper.selectProjectList();
	}	
}
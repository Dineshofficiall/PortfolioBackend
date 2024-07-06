package com.portfolio.PortfolioProject.ServiceInterface;

import com.portfolio.PortfolioProject.Dto.Request.ProjectRequestDto;
import com.portfolio.PortfolioProject.Dto.Response.ProjectResponseDto;
import com.portfolio.PortfolioProject.Entity.Project;

import java.util.List;

public interface ProjectInterface {
    String createProject(ProjectRequestDto projectRequestDto);

    ProjectResponseDto getProjectById(Long projectId);

    List<ProjectResponseDto> getAllProject();

    String updateProject(ProjectRequestDto projectRequestDto);

    String deleteProjectById(Long projectId);
}

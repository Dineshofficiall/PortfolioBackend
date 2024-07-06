package com.portfolio.PortfolioProject.ServiceImplementation;

import com.portfolio.PortfolioProject.Dto.Request.ProjectRequestDto;
import com.portfolio.PortfolioProject.Dto.Response.ProjectResponseDto;
import com.portfolio.PortfolioProject.Entity.Project;
import com.portfolio.PortfolioProject.Repository.ProjectRepository;
import com.portfolio.PortfolioProject.ServiceInterface.ProjectInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProjectImplementation implements ProjectInterface {

    @Autowired
    ProjectRepository projectRepository;

    @Override
    public String createProject(ProjectRequestDto projectRequestDto) {
        Project project = new Project();
        project.setId(projectRequestDto.getId());
        project.setTitle(projectRequestDto.getTitle());
        project.setDescription((projectRequestDto.getDescription()));
        project.setGithubUrlFrontend(projectRequestDto.getGithubUrlFrontend());
        project.setGithubUrlBackend(projectRequestDto.getGithubUrlBackend());
        project.setProductImage(projectRequestDto.getProductImage());
        project.setFrontendTech(projectRequestDto.getFrontendTech());
        project.setBackendTech(projectRequestDto.getBackendTech());
        project.setStatus(projectRequestDto.getStatus());
        project.setFeature(projectRequestDto.getFeature());
        projectRequestDto.setRecordDate(new Date());
        project.setRecordDate(projectRequestDto.getRecordDate());
        project.setRecentUpdate(projectRequestDto.getRecordDate());

        projectRepository.save(project);
        return "Successfully Created";
    }

    @Override
    public ProjectResponseDto getProjectById(Long projectId) {

        Project project = projectRepository.findById(projectId).get();

        ProjectResponseDto projectResponseDto = new ProjectResponseDto();

        projectResponseDto.setId(project.getId());
        projectResponseDto.setTitle(project.getTitle());
        projectResponseDto.setDescription(project.getDescription());
        projectResponseDto.setGithubUrlFrontend(project.getGithubUrlFrontend());
        projectResponseDto.setGithubUrlBackend(project.getGithubUrlBackend());
        projectResponseDto.setProductImage(project.getProductImage());
        projectResponseDto.setFrontendTech(project.getFrontendTech());
        projectResponseDto.setBackendTech(project.getBackendTech());
        projectResponseDto.setStatus(project.getStatus());
        projectResponseDto.setFeature(project.getFeature());
        projectResponseDto.setRecordDate(project.getRecordDate());
        projectResponseDto.setCompleteDate(project.getCompleteDate());
        projectResponseDto.setRecentUpdate(project.getRecentUpdate());

        return projectResponseDto;
    }

    @Override
    public List<ProjectResponseDto> getAllProject() {
        List<Project> allProjects = projectRepository.findAll();

        List<ProjectResponseDto> listProjectResponseDto = new ArrayList<>();
        for (Project project : allProjects) {

            ProjectResponseDto projectResponseDto = new ProjectResponseDto();

            projectResponseDto.setId(project.getId());
            projectResponseDto.setTitle(project.getTitle());
            projectResponseDto.setDescription(project.getDescription());
            projectResponseDto.setGithubUrlFrontend(project.getGithubUrlFrontend());
            projectResponseDto.setGithubUrlBackend(project.getGithubUrlBackend());
            projectResponseDto.setProductImage(project.getProductImage());
            projectResponseDto.setFrontendTech(project.getFrontendTech());
            projectResponseDto.setBackendTech(project.getBackendTech());
            projectResponseDto.setStatus(project.getStatus());
            projectResponseDto.setFeature(project.getFeature());
            projectResponseDto.setRecordDate(project.getRecordDate());
            projectResponseDto.setCompleteDate(project.getCompleteDate());
            projectResponseDto.setRecentUpdate(project.getRecentUpdate());

            listProjectResponseDto.add(projectResponseDto);
        }
        return listProjectResponseDto;
    }

    @Override
    public String updateProject(ProjectRequestDto projectRequestDto) {

        Project project = projectRepository.findById(projectRequestDto.getId()).get();

        project.setTitle(projectRequestDto.getTitle());
        project.setDescription(projectRequestDto.getDescription());
        project.setGithubUrlFrontend(projectRequestDto.getGithubUrlFrontend());
        project.setGithubUrlBackend(projectRequestDto.getGithubUrlBackend());
        project.setProductImage(projectRequestDto.getProductImage());
        project.setFrontendTech(projectRequestDto.getFrontendTech());
        project.setBackendTech(projectRequestDto.getBackendTech());
        project.setStatus(projectRequestDto.getStatus());
        project.setFeature(projectRequestDto.getFeature());
        project.setRecordDate(projectRequestDto.getRecordDate());
        project.setCompleteDate(projectRequestDto.getCompleteDate());
        project.setRecentUpdate(projectRequestDto.getRecentUpdate());

        projectRepository.save(project);

        ProjectResponseDto projectResponseDto = new ProjectResponseDto();

        projectResponseDto.setTitle(project.getTitle());
        projectResponseDto.setDescription(project.getDescription());
        projectResponseDto.setGithubUrlFrontend(project.getGithubUrlFrontend());
        projectResponseDto.setGithubUrlBackend(project.getGithubUrlBackend());
        projectResponseDto.setProductImage(project.getProductImage());
        projectResponseDto.setFrontendTech(project.getFrontendTech());
        projectResponseDto.setBackendTech(project.getBackendTech());
        projectResponseDto.setStatus(project.getStatus());
        projectResponseDto.setFeature(project.getFeature());
        projectResponseDto.setRecordDate(project.getRecordDate());
        projectResponseDto.setCompleteDate(project.getCompleteDate());
        projectResponseDto.setRecentUpdate(project.getRecentUpdate());

        return "Updated Successfully";
    }

    @Override
    public String deleteProjectById(Long projectId) {
        projectRepository.deleteById(projectId);
        return "Deleted Successfully";
    }
}

package com.portfolio.PortfolioProject.Controller;

import com.portfolio.PortfolioProject.Dto.Request.ProjectRequestDto;
import com.portfolio.PortfolioProject.Dto.Response.ProjectResponseDto;
import com.portfolio.PortfolioProject.Entity.Project;
import com.portfolio.PortfolioProject.ServiceInterface.ProjectInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Portfolio")
public class ProjectController {

    @Autowired
    ProjectInterface projectInterface;

    @PostMapping("/Project/Create")
    public ResponseEntity<?> createProject(@RequestBody ProjectRequestDto projectRequestDto) {
        String projectResponse = projectInterface.createProject(projectRequestDto);

        if (projectResponse != null){
            return ResponseEntity.status(HttpStatus.OK)
                    .body(projectResponse);
        }
        else {
            return ResponseEntity.status(HttpStatus.OK)
                    .body("error occurred in createProject");
        }
    }

    @GetMapping("/Project/getById/{projectId}")
    public ResponseEntity<?> getProjectById (@PathVariable Long projectId){
        ProjectResponseDto singleProjectResponse = projectInterface.getProjectById(projectId);

        if (singleProjectResponse != null) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(singleProjectResponse);
        }
        else {
            return ResponseEntity.status(HttpStatus.OK)
                    .body("error occurred in the singleProject");
        }
    }

    @GetMapping("/Project/getAllProject")
    public ResponseEntity<?> getAllProject (){
        List<ProjectResponseDto> allProjectResponse = projectInterface.getAllProject();

        if (allProjectResponse != null){
            return ResponseEntity.status(HttpStatus.OK)
                    .body(allProjectResponse);
        }
        else {
            return ResponseEntity.status(HttpStatus.OK)
                    .body("error occurred in the allProject");
        }
    }

    @PutMapping("/Project/UpdateProject")
    public ResponseEntity<?> updateProject (@RequestBody ProjectRequestDto projectRequestDto) {
        String updateProjectResponse = projectInterface.updateProject(projectRequestDto);

        if (updateProjectResponse != null) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(updateProjectResponse);
        }
        else {
            return ResponseEntity.status(HttpStatus.OK)
                    .body("error occurred in the updateProject");
        }
    }

    @DeleteMapping("/Project/DeleteById/{projectId}")
    public ResponseEntity<?> deleteProjectById (@PathVariable Long projectId) {

        String deleteProjectResponse = projectInterface.deleteProjectById(projectId);

        if (deleteProjectResponse != null) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(deleteProjectResponse);
        }
        else {
            return ResponseEntity.status(HttpStatus.OK)
                    .body("error occurred in the delelteProject");
        }
    }
}

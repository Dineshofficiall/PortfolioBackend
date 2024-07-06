package com.portfolio.PortfolioProject.ServiceImplementation;

import com.portfolio.PortfolioProject.Repository.ProjectRepository;
import com.portfolio.PortfolioProject.ServiceInterface.ProjectInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectImplementation implements ProjectInterface {

    @Autowired
    ProjectRepository projectRepository;
}

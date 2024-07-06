package com.portfolio.PortfolioProject.Controller;

import com.portfolio.PortfolioProject.ServiceInterface.ProjectInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/portfolio")
public class ProjectController {

    @Autowired
    ProjectInterface projectInterface;
}

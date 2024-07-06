package com.portfolio.PortfolioProject.Repository;

import com.portfolio.PortfolioProject.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}

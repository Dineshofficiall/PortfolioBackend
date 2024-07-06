package com.portfolio.PortfolioProject.Entity;

import com.portfolio.PortfolioProject.Converter.ProductImageConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "github_url_frontend")
    private String githubUrlFrontend;

    @Column(name = "github_url_backend")
    private String githubUrlBackend;

    @Column(name = "images", columnDefinition = "varchar(800)")
    @Convert(converter = ProductImageConverter.class)
    private List<String> productImage;

    @Column(name = "frontend_technologies")
    private List<String> frontendTech;

    @Column(name = "backend_technologies")
    private List<String> backendTech;

    @Column(name = "status")
    private String status;

    @Column(name = "feature")
    private String feature;

    @Column(name = "recordAt")
    private Date recordDate;

    @Column(name = "completeAt")
    private Date completeDate;

    @Column(name = "updatedAt")
    private Date recentUpdate;
}

package com.portfolio.PortfolioProject.Dto.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectRequestDto {

    private Long id;

    private String title;

    private String description;

    private String githubUrlFrontend;

    private String githubUrlBackend;

    private List<String> productImage;

    private List<String> frontendTech;

    private List<String> backendTech;

    private String status;

    private String feature;

    private Date recordDate;

    private Date completeDate;

    private Date recentUpdate;
}

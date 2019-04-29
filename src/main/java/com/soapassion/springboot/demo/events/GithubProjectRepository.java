package com.soapassion.springboot.demo.events;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface GithubProjectRepository extends PagingAndSortingRepository<GithubProject,Long> {

    GithubProject getProjectById(Long id);

    GithubProject getProjectByRepoName(String repoName);

}

package com.example.demo.services;

import com.example.demo.domain.Project;
import com.example.demo.exceptions.IdentifierException;
import com.example.demo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){
        try{
            return projectRepository.save(project);
        }
        catch (Exception e){
            throw new IdentifierException("Identifier '"+ project.getIdentifier() + "' exists");
        }
    }

    public List<Project> getAll(){
        return projectRepository.findAll();
    }
}

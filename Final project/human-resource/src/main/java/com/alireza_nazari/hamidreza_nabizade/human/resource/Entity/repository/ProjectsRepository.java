package com.alireza_nazari.hamidreza_nabizade.human.resource.Entity.repository;

import com.alireza_nazari.hamidreza_nabizade.human.resource.Entity.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectsRepository extends JpaRepository<Projects, Long> {

}
package com.jparepo.h2setup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jparepo.h2setup.model.H2entity;

public interface H2repo extends JpaRepository<H2entity,Long>{

}

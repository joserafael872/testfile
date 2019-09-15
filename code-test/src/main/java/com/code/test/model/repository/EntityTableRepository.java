package com.code.test.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityTableRepository extends JpaRepository<UserEntityTable, Long>{

}

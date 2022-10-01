package com.jetbrains.springdatajpa;

import entity.ChuyenBay;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import java.util.List;

@Repository
public interface EmployeeRepository extends
        CrudRepository<ChuyenBay, Long> {

    List<ChuyenBay> findEmployeeByLastName(String lastName);
}

package com.begin.projectA.Repository;

import com.begin.projectA.Entities.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
public interface SalesRepository extends JpaRepository<Sales, Integer> {
}
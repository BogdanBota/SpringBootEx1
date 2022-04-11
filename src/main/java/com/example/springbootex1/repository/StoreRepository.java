package com.example.springbootex1.repository;

import com.example.springbootex1.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository  extends JpaRepository<Store, Integer> {
}
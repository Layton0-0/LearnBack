package com.my.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.my.domain.StoreInfo;

@Repository
public interface StoreInfoRepository extends JpaRepository<StoreInfo, String>{

}

package com.my.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.my.domain.StoreInfo;
import com.my.domain.StoreInfoJoin;

@Repository
public interface StoreInfoJoinRepository extends JpaRepository<StoreInfoJoin, String>{

}

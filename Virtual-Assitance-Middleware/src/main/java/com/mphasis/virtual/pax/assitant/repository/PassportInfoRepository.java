package com.mphasis.virtual.pax.assitant.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.virtual.pax.assitant.entity.PassportInfo;

@Repository
public interface PassportInfoRepository extends CrudRepository<PassportInfo,Integer> {

}

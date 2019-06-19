package com.wonyong.springboot.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wonyong.springboot.MyDataMongo;

public interface MyDataMongoRepository extends MongoRepository<MyDataMongo, Long> 
{
	public List<MyDataMongo> findById(String k);
	public void deleteById(String param);
}

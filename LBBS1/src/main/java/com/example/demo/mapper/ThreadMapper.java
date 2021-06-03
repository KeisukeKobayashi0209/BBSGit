package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Threads;


	
@Mapper
public interface ThreadMapper{
	List<Threads> findAll();
}


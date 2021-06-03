package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Threads;
import com.example.demo.mapper.ThreadMapper;


@Service
public class ThreadService {

		@Autowired
				 ThreadMapper threadMapper;
		
		
		public List <Threads> findAll(){
			return threadMapper.findAll();
		}

}
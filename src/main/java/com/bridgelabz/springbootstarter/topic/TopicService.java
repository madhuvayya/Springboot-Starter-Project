package com.bridgelabz.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics =  Arrays.asList(
			new Topic(1,"Java","Most widely user backend programming language"),
			new Topic(2,"Sql","Sql is the most idely used language to interact with database"),
			new Topic(3,"Frontend","Html,css and Javascript")
			);
	
	public List<Topic> getAllTopics(){
		return topics;
	}
}

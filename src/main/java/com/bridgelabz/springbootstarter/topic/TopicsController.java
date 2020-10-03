package com.bridgelabz.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {
	
	@Autowired
	private TopicService topicService;

	@GetMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@GetMapping("/topic/{id}")
	public Topic getTopic(@PathVariable("id") int id) {
		Topic topic = topicService.getTopicById(id);
		if(!topic.equals(null)) {
			return topic;
		}
		return null;
	}

}

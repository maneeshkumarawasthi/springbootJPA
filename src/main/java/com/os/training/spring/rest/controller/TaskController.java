package com.os.training.spring.rest.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.os.training.spring.jpa.entity.Task;
import com.os.training.spring.jpa.repo.TaskRepository;

@RestController
public class TaskController {

	@Inject
	TaskRepository taskRepository = null;

	@RequestMapping(value = "/tasks/save", method = RequestMethod.POST)
	public Task save(@RequestBody Task task) {
		System.out.println("TaskController: task=" + task);
		return taskRepository.save(task);
	}

	@RequestMapping(value = "/tasks/search/findByTaskArchived", method = RequestMethod.GET)
	public List<Task> findByTaskArchived(@RequestParam(value = "archivedfalse") String archivedfalse) {
		System.out.println("TaskController: archivedfalse=" + archivedfalse);
		return taskRepository.findByTaskArchived(Integer.parseInt(archivedfalse));
	}

}
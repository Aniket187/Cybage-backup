package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.model.Todo;
import com.example.demo.service.TodoService;
@CrossOrigin(origins = "*")
@RestController
public class TodoController {
	@Autowired
	TodoService todoService;
	@PostMapping("/todo")
	private String saveTodo(@RequestBody Todo todo){
		todoService.saveUpdate(todo);
		return todo.getTitle()+" was added";
	}
	@PutMapping("/update{id}")
	private String  update(@RequestParam int id) throws ResourceNotFoundException{
		
		todoService.findById(id).orElseThrow(()->new ResourceNotFoundException("Todo not found for this id="+id));
		todoService.update(id);
		return "Todo Updated";
	
		
	}
	@GetMapping("/findtodo{id}")
	private List<Todo> findAll(@RequestParam int id) throws ResourceNotFoundException{
		List<Todo> li;
		li=todoService.findAll(id);
		if(li.isEmpty()){
			throw new ResourceNotFoundException("No Todo Found for current User");
		}
		return li;
	}
	@DeleteMapping("/Delete{id}")
	private String deleteById(@RequestParam int id)throws ResourceNotFoundException{
		todoService.findById(id).orElseThrow(()-> new ResourceNotFoundException("Todo not found for this id"+id));
		todoService.delete(id);
		return "Todo Deleted";
	}

}

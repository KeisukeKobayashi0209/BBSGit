package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Service.ThreadService;

@Controller
@RequestMapping("/thread")
public class ThreadController {
	@Autowired
	ThreadService threadService;
	@GetMapping("/main")
	public String findAll(Model model) {
			model.addAttribute("Thre",threadService.findAll());
					return "/main";
	}
	
	
	
	
//   @GetMapping("/login")
//    public String login() {
//    
//        return "login";
//    }
//
//    @GetMapping("/new")
//    public String create() {
//    
//        return "new thread";
//    }
//    
//    @GetMapping("/user")
//    public String information() {
//    
//        return "user information";
//    }
//    
//    @GetMapping("/details")
//    public String details() {
//    
//        return "thread details";
//    }
}

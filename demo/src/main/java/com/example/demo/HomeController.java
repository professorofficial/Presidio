package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired
    AdminRepo repo;
    
    @RequestMapping("/")
    public String login(){
        return "login.html";
    }
    @RequestMapping("/login2")
    public String login2(@RequestParam("username") String name,@RequestParam("password") String password){
        
        System.out.println(name+" "+password);
        if(name.equals("admin@gmail.com") && password.equals("12345")){
            return "admin.html";
        }
        try{
        Optional<Admin> admin=repo.findByUsernameAndPassword(name, password);
        if(admin.get().getUsername().equals(name) && admin.get().getPassword().equals(password)){
            return "user.html";
        }
        }catch(Exception e){
        
        return "login.html";
        }
        return "login.html";
    }
    @RequestMapping("/signup")
    public String signup(){
        return "signup.html";
    }
    @RequestMapping("/register")
    public String register(Admin a){
		repo.save(a);
		
		return "login.html";
    }
}

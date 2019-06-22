package com.user.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.commons.constant.ResultValue;
import com.commons.core.ResultBody;
import com.user.model.User;
import com.user.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService service;
	
	@ResponseBody
	@RequestMapping("/save")
//    public ResultBody save(@RequestParam User u){
	 public ResultBody save(){
		User u = new User();
		u.setObjId("4556");
//        service.save(u);
        return service.save(u);

    }
	
	@ResponseBody
	@RequestMapping("/queryAll")
    public List queryAll(){
        List list = service.queryAll();
        return list;

    }
	
}

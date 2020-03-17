package cn.linkpower.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.linkpower.interfaces.ApiVersion;


@Controller
public class VersionControllerTest {
	
	@ApiVersion
	@GetMapping("/{version}/test1")
	@ResponseBody
	public String test1(){
		return "test 1";
	}
	
	@ApiVersion
	@GetMapping("/{ver}/test2")
	@ResponseBody
	public String test2(){
		return "test 2";
	}
	
	@ApiVersion(3)
	@GetMapping("/{version}/test3")
	@ResponseBody
	public String test3(){
		return "test 3";
	}
	@RequestMapping("/test")
	@ResponseBody
	public String test(){
		return "6666";
	}
}

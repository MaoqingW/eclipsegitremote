package org.lanqiao.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//接口、类、注解（比较时尚）、配置
@Controller
@RequestMapping("handler")   //映射
public class SpringMVCHanlder {
	@RequestMapping(value="welcome",method=RequestMethod.POST,params= {"name=zs","age!=23","!height"})  //映射
	public String welcome() {
		return "success";	//  views/success.jsp默认使用了请求转发的跳转方式
	}
	@RequestMapping(value="welcome2",headers="")  //映射
	public String welcome2() {
		return "success";	//  views/success.jsp默认使用了请求转发的跳转方式
	}
	@RequestMapping(value="welcome3/**/test")  //映射
	public String welcome3() {
		return "success";	//  views/success.jsp默认使用了请求转发的跳转方式
	}
	@RequestMapping(value="welcome4/a?c/test")  //映射
	public String welcome4() {
		return "success";	//  views/success.jsp默认使用了请求转发的跳转方式
	}
	@RequestMapping(value="welcome5/{name}")  //映射
	public String welcome5(@PathVariable("name") String name) {
		System.out.println(name);
		return "success";	//  views/success.jsp默认使用了请求转发的跳转方式
	}
	@RequestMapping(value="testRest/{id}",method=RequestMethod.POST)
	public String testPost(@PathVariable("id") Integer id) {
		System.out.println("Post:增"+id);
		//Service层实现真正的增
		return "success";
	}
	@RequestMapping(value="testRest/{id}",method=RequestMethod.DELETE)
	public String testDelete(@PathVariable("id") Integer id) {
		System.out.println("Delete:删"+id);
		return "success123131";
	}
	@RequestMapping(value="testRest/{id}",method=RequestMethod.PUT)
	public String testPut(@PathVariable("id") Integer id) {
		System.out.println("Put:改"+id);
		return "success";
	}
	@RequestMapping(value="testRest/{id}",method=RequestMethod.GET)
	public String testGet(@PathVariable("id") Integer id) {
		System.out.println("Get:查"+id);
		return "success";
	}
	@RequestMapping(value="testParam")
	public String testParam(@RequestParam("uname") String name,@RequestParam(value="uage",required=false,defaultValue="23") Integer age) {
//		String name = request.getParameter("uname");
		System.out.println(name);
		System.out.println(age);
		return "success";
	}
	@RequestMapping(value="testRequestHeader")
	public String testRequestHeader(@RequestHeader("Accept-Language") String s1) {
		System.out.println(s1);
		return "success";
	}
}

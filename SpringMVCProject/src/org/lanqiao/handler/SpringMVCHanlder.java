package org.lanqiao.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//�ӿڡ��ࡢע�⣨�Ƚ�ʱ�У�������
@Controller
@RequestMapping("handler")   //ӳ��
public class SpringMVCHanlder {
	@RequestMapping(value="welcome",method=RequestMethod.POST,params= {"name=zs","age!=23","!height"})  //ӳ��
	public String welcome() {
		return "success";	//  views/success.jspĬ��ʹ��������ת������ת��ʽ
	}
	@RequestMapping(value="welcome2",headers="")  //ӳ��
	public String welcome2() {
		return "success";	//  views/success.jspĬ��ʹ��������ת������ת��ʽ
	}
	@RequestMapping(value="welcome3/**/test")  //ӳ��
	public String welcome3() {
		return "success";	//  views/success.jspĬ��ʹ��������ת������ת��ʽ
	}
	@RequestMapping(value="welcome4/a?c/test")  //ӳ��
	public String welcome4() {
		return "success";	//  views/success.jspĬ��ʹ��������ת������ת��ʽ
	}
	@RequestMapping(value="welcome5/{name}")  //ӳ��
	public String welcome5(@PathVariable("name") String name) {
		System.out.println(name);
		return "success";	//  views/success.jspĬ��ʹ��������ת������ת��ʽ
	}
	@RequestMapping(value="testRest/{id}",method=RequestMethod.POST)
	public String testPost(@PathVariable("id") Integer id) {
		System.out.println("Post:��"+id);
		//Service��ʵ����������
		return "success";
	}
	@RequestMapping(value="testRest/{id}",method=RequestMethod.DELETE)
	public String testDelete(@PathVariable("id") Integer id) {
		System.out.println("Delete:ɾ"+id);
		return "success123131";
	}
	@RequestMapping(value="testRest/{id}",method=RequestMethod.PUT)
	public String testPut(@PathVariable("id") Integer id) {
		System.out.println("Put:��"+id);
		return "success";
	}
	@RequestMapping(value="testRest/{id}",method=RequestMethod.GET)
	public String testGet(@PathVariable("id") Integer id) {
		System.out.println("Get:��"+id);
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

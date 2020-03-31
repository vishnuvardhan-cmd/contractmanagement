package com.contractmanagement.controle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.contractmanagement.roleselection1.Supplier;
import com.contractmanagement.supplierdao.SupplierDAO;

@Controller
public class ControllerMain {
	@Autowired
	SupplierDAO dao;
	String msgr="your data has been submitted successfully";

	/*
	 * @RequestMapping("/hello") public String redirect() { return "supplier"; }
	 */
@RequestMapping("/suppform")
public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
	String fname = request.getParameter("fname");
	String lname = request.getParameter("lname");
	int age = Integer.parseInt(request.getParameter("age"));
	String gender = request.getParameter("gender");
	String contactnumber = request.getParameter("contactnumber");
	int supplierid = Integer.parseInt(request.getParameter("supplierid"));
	String password = request.getParameter("password");
    com.contractmanagement.roleselection1.Supplier s=new Supplier(fname,lname,age,gender,contactnumber,supplierid,password);
	int res = dao.save(s);
	if (res > 0) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("supplier");
		mv.addObject("msg",msgr);
		return mv;
	}
	else
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("supplier");
		return mv;
	}
}

	@RequestMapping("/supp")
	public String Supplier() {
		return "supplier";
	}
}

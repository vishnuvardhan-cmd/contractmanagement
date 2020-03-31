package com.javatpoint;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {
@RequestMapping("/hello")
	public String redirect()
	{
		return "supplier";
	}	
@RequestMapping("/helloagain")
public String display()
{
	return "final";
}
@RequestMapping("/supp")
public String Supplier()
{
	return "supplier";
}
}

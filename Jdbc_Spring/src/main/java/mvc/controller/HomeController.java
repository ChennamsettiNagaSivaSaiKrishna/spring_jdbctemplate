package mvc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import mvc.dao.DAOBridge;
import mvc.model.Student;

@Controller
public class HomeController {
	
	@Autowired 
	DAOBridge db;

	@RequestMapping("/")
	public String home()
	{
		return "register";
	}
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public String addUser(Student s,Model m)
	{
		db.insertStudent(s.getSroll(), s.getSname(), s.getSmarks(), s.getSsection(), s.getSdept());
		List<Student>st=db.getAllStudents(false);
		m.addAttribute("sobjs",st);
		return "success";
	}
	
	@RequestMapping(value="/addUser",method=RequestMethod.GET)
	public String addUserOrm(Student s,Model m)
	{
		db.insertStudent(s.getSroll(), s.getSname(), s.getSmarks(), s.getSsection(), s.getSdept());
		List<Student>st=db.getAllStudents(true);
		m.addAttribute("sobjs",st);
		return "success";
	}
}

package studentcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



import studentdao.Studentdao;
import studentdto.Studentdto;


@Controller
public class Studentcontroller {
	//@Autowired
	//Studentdao dao;
	
	private static final String Operations = null;
	@RequestMapping("/signin")
	public ModelAndView signin() {
		ModelAndView modelAndView = new ModelAndView("signin.jsp");
		Studentdto dto=new Studentdto();
		modelAndView.addObject("stdobject", dto);
		return modelAndView;
	}

	@ResponseBody
	@RequestMapping("/insert")
	public void saveData(Studentdto recobject) {
		Studentdao dao=new Studentdao();
dao.insert(recobject);
		
	}
	@RequestMapping("/fetch")
	public ModelAndView display() {
		ModelAndView view=new ModelAndView("get.jsp");
		Studentdto dto=new Studentdto();
		return view.addObject("object1",dto);
		
	}
	@ResponseBody
	@RequestMapping("/displayjs")
	public ModelAndView display(String email) {
		Studentdao dao=new Studentdao();
		Studentdto dto=dao.findbyId(email);
		ModelAndView view=new ModelAndView("fetch.jsp");
		view.addObject("reqk",dto);
		return view;
}
}

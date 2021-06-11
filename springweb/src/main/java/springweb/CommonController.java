package springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jspider.springmvc.dto.RegisterDto;


import dto.RegisterDto;

@Controller
@RequestMapping("/")


public class CommonController {

	public CommonController() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}
	//@RequestMapping(value = "/register", method = RequestMethod.POST)
	@PostMapping(value = "/register")
	public ModelAndView register(RegisterDto registerDto) {
		System.out.println(registerDto);
		return new ModelAndView("home.jsp","msg",registerDto.getName());
	}
}

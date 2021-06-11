package springweb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import dto.UserDto;
import service.UserService;

@EnableWebMvc
@RestController
@RequestMapping(value = "/users/*")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@GetMapping(value = "/getusers")
	public @ResponseBody List<User> getUsers() {
		return  userService.getUsers();
	}
	
	@GetMapping(value = "/getuser/{id}")
	public @ResponseBody User getUserById(@PathVariable("id") int id) {	
			
		return null;
	}
	
	@PostMapping(value = "/saveUserDetails")
	public void saveUserDetails(@RequestBody User user) {
		userService.saveUser(user);
	}
	
}


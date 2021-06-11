package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.UserDto;
import repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public void saveUser(UserDto user) {
		repository.saveUser(user);
	}
	
	public List<UserDto> getUsers() {
		return repository.getUsers();
	}
}


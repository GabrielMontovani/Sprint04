package br.com.fiap.challenge.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.fiap.challenge.model.User;
import br.com.fiap.challenge.repository.UserRepository;
@Service
public class AuthenticationService implements UserDetailsService {
	@Autowired
	private UserRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		Optional<User> user = repository.findByEmail(username);
		if (user.isEmpty()) throw new UsernameNotFoundException("User not found");
		return user.get();
	}
}

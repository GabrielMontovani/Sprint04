package br.com.fiap.challenge.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import br.com.fiap.challenge.repository.UserRepository;
public class AuthenticationService implements UserDetailsService {
	@Autowired
	private UserRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		Optional<User> user = repository.findByEmail(username);
		if (user.isEmpty()) throw new UsernameNotFoundException("Usar not found");
		return user.get();
	}
}

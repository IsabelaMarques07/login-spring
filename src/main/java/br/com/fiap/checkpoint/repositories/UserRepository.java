package br.com.fiap.checkpoint.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.checkpoint.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsername(String username);
	User findByPassword(String password);
}

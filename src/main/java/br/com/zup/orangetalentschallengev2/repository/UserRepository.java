package br.com.zup.orangetalentschallengev2.repository;

import br.com.zup.orangetalentschallengev2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

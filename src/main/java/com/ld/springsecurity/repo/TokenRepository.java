package com.ld.springsecurity.repo;

import com.ld.springsecurity.model.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TokenRepository extends JpaRepository<Token, String> {
    @Query(value = "select t from Token t inner join User u on t.user.id = u.id where u.id = :id and (t.expired = false or t.revoked = false )")
    List<Token> findAllValidTokenByUser(String id);

    Optional<Token> findByToken(String token);
}

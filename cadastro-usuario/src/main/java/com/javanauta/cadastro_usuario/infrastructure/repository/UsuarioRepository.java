package com.javanauta.cadastro_usuario.infrastructure.repository;

import com.javanauta.cadastro_usuario.infrastructure.entitiys.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmail(String email); // Quando se usa o Optional, é obrigação criar uma exceção caso a condição não exista

    @Transactional // Anotação feita para caso der um erro, ele não deletar a conta.
    void deleteByEmail(String email);
}

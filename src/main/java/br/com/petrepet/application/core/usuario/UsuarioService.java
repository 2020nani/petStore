package br.com.petrepet.application.core.usuario;


import org.springframework.http.ResponseEntity;

public interface UsuarioService {

    public Usuario salvarUsuario(Usuario usuario);

    String deletaUsuario(Long id);

    ResponseEntity<String> deletaUsuarioMensagem(Long id);
}

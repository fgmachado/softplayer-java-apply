package br.com.softplan.softplayerjavaapply.usuario.service;

import br.com.softplan.softplayerjavaapply.usuario.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository repository;

}

package org.example.formulario.controllers;
import org.example.formulario.models.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "https://wanderboy131.github.io",
        methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @GetMapping("/traerUsuario")
    public List<Usuario> prueba() {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario1 = new Usuario(2, "wateter", "4567");
        Usuario usuario2 = new Usuario(3, "Nicolle", "4567" );
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        return usuarios;
    }
    @PostMapping("/crearUsuario")
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return usuario;
    }
    @PutMapping("/editarUsuario/{id}")
    public void editarUsuario(   @PathVariable int id , @RequestBody Usuario usuario) {

    }
    @DeleteMapping("/eliminarUsuario/{id}")
    public void eliminarUsuario(@PathVariable int id){
    }


}

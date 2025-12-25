package org.example.formulario.controllers;
import org.example.formulario.models.Usuario;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "https://wanderboy131.github.io/front-api/",
        methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @GetMapping("/traerUsuario")
    public Usuario prueba() {
        Usuario usuario = new Usuario(2, "wateter", "4567");
        return usuario;
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

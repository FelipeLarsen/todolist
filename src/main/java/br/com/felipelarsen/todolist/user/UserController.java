package br.com.felipelarsen.todolist.user;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Modificadores de acesso:
 * public: acesso total
 * private: acesso somente dentro da classe
 * protected: acesso somente dentro do pacote e classes filhas
 * default: acesso somente dentro do pacote
 */

@RestController
@RequestMapping("/users")
public class UserController {

    /**
     * tipos de dados:
     * String
     * Integer
     * Double
     * Float
     * Char
     * Date
     * void
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.name);
    }
}

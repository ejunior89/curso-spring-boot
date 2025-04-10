package io.github.ejunior89.arquiteturaspring.montadora.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.github.ejunior89.arquiteturaspring.montadora.Aspirado;
import io.github.ejunior89.arquiteturaspring.montadora.CarroStatus;
import io.github.ejunior89.arquiteturaspring.montadora.Chave;
import io.github.ejunior89.arquiteturaspring.montadora.HondaHRV;
import io.github.ejunior89.arquiteturaspring.montadora.Motor;

@RestController
public class TesteFabricaController {

    @Autowired
    @Aspirado
    private Motor motor;

    @PostMapping("/carros")
    public CarroStatus ligarCarro(@RequestBody Chave chave) {
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }
}

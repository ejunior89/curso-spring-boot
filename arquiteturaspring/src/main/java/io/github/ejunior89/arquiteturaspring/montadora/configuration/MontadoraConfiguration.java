package io.github.ejunior89.arquiteturaspring.montadora.configuration;

import io.github.ejunior89.arquiteturaspring.montadora.Motor;
import io.github.ejunior89.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motor() {
        var motor = new Motor();
        motor.setCavalos(150);
        motor.setCilindros(6);
        motor.setModelo("PTO-9");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }
}
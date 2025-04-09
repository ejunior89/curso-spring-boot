package io.github.ejunior89.arquiteturaspring.montadora.configuration;

import io.github.ejunior89.arquiteturaspring.montadora.Motor;
import io.github.ejunior89.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    public Motor motor() {
        var motor = new Motor();
        motor.setCavalos(150);
        motor.setCilindros(6);
        motor.setModelo("PTO-9");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(150);
        motor.setCilindros(3);
        motor.setModelo("tesla");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavalos(150);
        motor.setCilindros(4);
        motor.setModelo("turbo");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }
}
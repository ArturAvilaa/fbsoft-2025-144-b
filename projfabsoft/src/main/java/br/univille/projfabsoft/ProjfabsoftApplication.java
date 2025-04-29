package br.univille.projfabsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal que inicializa a aplicação Spring Boot.
 */
@SpringBootApplication
public class ProjfabsoftApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjfabsoftApplication.class, args);
        System.out.println("🚀 Aplicação EventManager iniciada com sucesso!");
    }

}

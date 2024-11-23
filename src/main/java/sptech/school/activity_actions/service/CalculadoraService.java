package sptech.school.activity_actions.service;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class CalculadoraService {
    public Double dividir(double a, double b) {

        if (b == 0){
            throw new ResponseStatusException(
                    HttpStatusCode.valueOf(400),
                    "Divisão por zero não permitida"
            );
        }

        return a / b;
    }
}

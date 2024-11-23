package sptech.school.activity_actions.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sptech.school.activity_actions.service.CalculadoraService;

@RestController
@RequiredArgsConstructor
public class CalculadoraController {
    private final CalculadoraService calculadoraService;

    @GetMapping("/divisao/{a}/{b}")
    public ResponseEntity<Double> divisao(@PathVariable double a, @PathVariable double b){
        return ResponseEntity.ok(calculadoraService.dividir(a, b));
    }
}

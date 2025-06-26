package com.rqs.neon_store.strategy;

import org.springframework.stereotype.Component;

@Component
public class FreteExpresso implements CalculoFrete {
    @Override
    public double calcular(double peso) {
        // Lógica diferente para frete expresso (exemplo: mais caro)
        return peso * 8.0; // R$8 por kg
    }
}
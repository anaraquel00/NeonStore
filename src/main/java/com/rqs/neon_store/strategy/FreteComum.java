package com.rqs.neon_store.strategy;

import org.springframework.stereotype.Component;

@Component
public class FreteComum implements CalculoFrete {
    @Override
    public double calcular(double peso) {
        if (peso <= 1.0) return 5.00;
        else if (peso <= 5.0) return 10.00;
        else return 20.00;
    }
}
package com.eiv.gauss;

public class CalculoGaussAlt1Impl implements CalculoGauss {

    @Override
    public long calcular(int numero) {
        long result = 0;
        for (int i = 0; i <= numero; i++) {
            result += i;
        }
        return result;
    }

}

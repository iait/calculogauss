package com.eiv.gauss;

public class CalculoGaussAlt2Impl implements CalculoGauss {

    @Override
    public long calcular(int numero) {
        return (numero * (numero+1)) /2;
    }

}

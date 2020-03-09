package com.cotefacil2;

import com.cotefacil2.bytebank.modelos.Conta;

public class TesteBiblioteca {

    public static void main(String[] args) {
        Conta conta = new Conta(213, 879) {
            @Override
            public double getValorImposto() {
                return 0;
            }

            @Override
            public void deposita(double v) {

            }
        };

        conta.deposita(200.3);

        System.out.println(conta.getSaldo());
    }

}

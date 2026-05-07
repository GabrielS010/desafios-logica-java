package org.desafios_logica.validador_cambio;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        CambioService service = new CambioService();

        System.out.print("Digite um valor em reais: R$");
        BigDecimal valorReais = scanner.nextBigDecimal();

        System.out.print("\nDigite a cotacao do dolar: U$");
        BigDecimal cotacao = scanner.nextBigDecimal();

        BigDecimal valorDolar = service.calcularDolar(valorReais, cotacao);
        BigDecimal valorReaisConvertido = service.calcularReaisConvertidos(valorDolar, cotacao);

        System.out.println(valorDolar);
        System.out.println(valorReaisConvertido.setScale(2, RoundingMode.HALF_UP));

        if (valorReaisConvertido.compareTo(valorReais) == 0) {
            System.out.println("Conversão perfeita");
        } else {
            System.out.println("Houve perda de precisão. O valor da diferença é: R$" + valorReais.subtract(valorReaisConvertido).abs().setScale(2, RoundingMode.HALF_UP));
        }
    }
}
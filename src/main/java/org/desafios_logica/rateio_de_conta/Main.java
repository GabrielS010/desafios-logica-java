package org.desafios_logica.rateio_de_conta;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RateioService service = new RateioService();

        System.out.println("Digite um valor para ser dividido entre as pessoas: ");
        BigDecimal valor = scanner.nextBigDecimal();

        System.out.println("Digite a quantidade de pessoas: ");
        BigDecimal pessoas = scanner.nextBigDecimal();

        BigDecimal divisaoDinheiro = service.calcularDivisao(valor, pessoas);
        BigDecimal resto = service.calcularResto(valor, divisaoDinheiro, pessoas);

        System.out.println("Cada pessoa deverá pagar: R$" + divisaoDinheiro);
        System.out.println("O resto dessa divisão é: R$" + resto);

        scanner.close();
    }
}
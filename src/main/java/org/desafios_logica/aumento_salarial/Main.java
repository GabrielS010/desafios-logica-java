package org.desafios_logica.aumento_salarial;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SalarioService service = new SalarioService();

        System.out.println("Digite um valor do salário: ");
        BigDecimal salario = scanner.nextBigDecimal();

        BigDecimal salarioFinal = service.calcularSalarioFinal(salario);

        System.out.println(salarioFinal.setScale(2, RoundingMode.HALF_UP));

        scanner.close();
    }
}
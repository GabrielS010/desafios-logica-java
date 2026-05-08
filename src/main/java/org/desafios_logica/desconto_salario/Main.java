package org.desafios_logica.desconto_salario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        DescontoService descontoService = new DescontoService();

        System.out.print("Digite o valor bruto do salario: ");
        BigDecimal salarioBruto = sc.nextBigDecimal();

        BigDecimal salarioFinal = descontoService.calcularDesconto(salarioBruto).setScale(2, RoundingMode.HALF_UP);

        System.out.println("Salário Líquido: R$ " + salarioFinal);

        sc.close();
    }
}

package br.edu.uricer;

import java.math.BigDecimal;

/**
 *
 * @author Rodrigo Rosa <rodrigorosa@urice.edu.br>
 */
public class Calculadora {
    
    public BigDecimal calcular(Funcionario funcionario) {
    
        switch (funcionario.getCargo()) {
            case "DESENVOLVEDOR":
                return calcularParaDesenvolvedor(funcionario.getSalarioBase());
            case "GERENTE":
                return calcularParaGerente(funcionario.getSalarioBase());
            case "TESTADOR":
                return calcularParaTestador(funcionario.getSalarioBase());
            default:
                throw new AssertionError();
        }
    }
    
    private BigDecimal calcularParaDesenvolvedor(BigDecimal salarioBase) {
        if(salarioBase.compareTo(new BigDecimal("3000.00")) >= 0) {
            return salarioBase.multiply(new BigDecimal("0.8")).setScale(2);
        } else {
            return salarioBase.multiply(new BigDecimal("0.9")).setScale(2);
        }
    }
    
    private BigDecimal calcularParaGerente(BigDecimal salarioBase) {
        if(salarioBase.compareTo(new BigDecimal("5000.00")) >= 0) {
            return salarioBase.multiply(new BigDecimal("0.70")).setScale(2);
        } else {
            return salarioBase.multiply(new BigDecimal("0.80")).setScale(2);
        }
    }
    
    private BigDecimal calcularParaTestador(BigDecimal salarioBase) {
        if(salarioBase.compareTo(new BigDecimal("2000.00")) >= 0) {
            return salarioBase.multiply(new BigDecimal("0.75")).setScale(2);
        } else {
            return salarioBase.multiply(new BigDecimal("0.85")).setScale(2);
        }
    }    
    
}

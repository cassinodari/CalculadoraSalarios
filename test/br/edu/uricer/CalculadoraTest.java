package br.edu.uricer;

import java.math.BigDecimal;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo Rosa <rodrigorosa@urice.edu.br>
 */
public class CalculadoraTest {
    
    @Test
    public void deveCalcularSalarioParaDesenvolvedor() {
        Calculadora calculadora = new Calculadora();
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Cassiane Nodari");
        funcionario.setEmail("cassi.nodari24@gmail.com");
        funcionario.setSalarioBase(new BigDecimal("5000.00"));
        funcionario.setCargo("DESENVOLVEDOR");
        
        assertEquals(new BigDecimal("4000.00"), calculadora.calcular(funcionario));
    }
    
    @Test
    public void deveCalcularSalarioParaGerente() {
        Calculadora calculadora = new Calculadora();
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Cassiane Nodari");
        funcionario.setEmail("cassi.nodari24@gmail.com");
        funcionario.setSalarioBase(new BigDecimal("2500.00"));
        funcionario.setCargo("GERENTE");
        
        assertEquals(new BigDecimal("2000.00"), calculadora.calcular(funcionario));
    }   
    
    @Test
    public void deveCalcularSalarioParaTestador() {
        Calculadora calculadora = new Calculadora();
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Cassiane Nodari");
        funcionario.setEmail("cassi.nodari24@gmail.com");
        funcionario.setSalarioBase(new BigDecimal("550.00"));
        funcionario.setCargo("TESTADOR");
        
        assertEquals(new BigDecimal("467.50"), calculadora.calcular(funcionario));
    }    
}

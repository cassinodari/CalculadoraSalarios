package br.edu.uricer;

import java.math.BigDecimal;

/**
 *
 * @author Rodrigo Rosa <rodrigorosa@urice.edu.br>
 */
public class Funcionario {
    private String nome;
    private String email;
    private BigDecimal salarioBase;
    private String cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(BigDecimal salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }   
}

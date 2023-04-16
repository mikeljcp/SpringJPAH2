package com.example.Springjpah2;

public class Cliente {

    //Atributos
    private Long id;
    private Float altura;
    private Float peso;
    private Integer edad;

    //Costructores

    public Cliente() {
    }

    public Cliente(Long id, Float altura, Float peso, Integer edad) {
        this.id = id;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
    }

    //Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    //ToString

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", altura=" + altura +
                ", peso=" + peso +
                ", edad=" + edad +
                '}';
    }
}

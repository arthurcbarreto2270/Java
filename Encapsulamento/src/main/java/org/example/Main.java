package org.example;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Produto pr1 = new Produto();

//        c1.nome = "Marta";

        c1.setNome("Marta");
        c1.setIdade(25);

        System.out.println("Nome: " + c1.getNome());
        System.out.println("Idade: " + c1.getIdade());

        pr1.setNomeP("Arroz");
        pr1.setVlUnit("300g");

        System.out.println("Nome do Produto: " + pr1.getNomeP());
        System.out.println("Valor Unitario: " + pr1.getVlUnit());


    }
}
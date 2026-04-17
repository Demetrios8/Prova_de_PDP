package com.stockcontrol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos dados do produto
        System.out.print("Digite o nome do produto: ");
        String name = sc.nextLine();

        System.out.print("Digite o preço do produto: ");
        double price = Double.parseDouble(sc.nextLine().replace(",", "."));

        System.out.print("Digite a quantidade inicial em estoque: ");
        int initialQty = Integer.parseInt(sc.nextLine());

        System.out.print("Digite a quantidade vendida: ");
        int soldQty = Integer.parseInt(sc.nextLine());

        // Criação do objeto Produto
        Product p = new Product(name, price, initialQty);

        // Exibição das informações antes da venda
        System.out.println("\nAntes da venda:");
        System.out.println("Produto: " + p.getName());
        System.out.println("Preço: " + p.getPrice());
        System.out.println("Quantidade em estoque: " + p.getQuantity());

        // Processamento da venda
        if (soldQty > p.getQuantity()) {
            System.out.println("Estoque insuficiente para realizar a venda.");
        } else {
            p.setQuantity(p.getQuantity() - soldQty);
        }

        // Exibição das informações depois da venda
        System.out.println("\nDepois da venda:");
        System.out.println("Produto: " + p.getName());
        System.out.println("Preço: " + p.getPrice());
        System.out.println("Quantidade em estoque: " + p.getQuantity());

        sc.close();
    }
}

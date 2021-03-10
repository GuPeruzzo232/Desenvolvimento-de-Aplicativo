
package Biblioteca;

import java.util.Scanner;
import Biblioteca.Livro;
import Biblioteca.Cliente;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Livro livro = new Livro();
        Cliente cliente = new Cliente();
        
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Bem vindo ao sistema da biblioteca Acarajú");
        System.out.println("Aqui, faremos um cadastro para você");
        System.out.println("Primeiramente, gostariamos que informasse algumas coisas para nós");
        System.out.println("Nome: ");
        cliente.setNome(in.nextLine());
        System.out.println("CPF para verificarmos seu cadastro caso seja preciso no futuro: ");
        cliente.setCpf(in.nextLine());
        System.out.println("Endereço para entregas: ");
        cliente.setEndereco(in.nextLine());
        System.out.println("Seu endereço de e-mail caso precisemos entrar em contato: ");
        cliente.setEmail(in.nextLine());
        System.out.println("Sua idade, para sabermos se terá acesso a livros adultos ou não: ");
        cliente.setIdade(in.nextInt());
        
        in.nextLine();
        
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Agora que seu cadastro fora efetuado, por ser uma pessoa ligada a história...");
        System.out.println("Poderias cadastras um livro para nós?");
        System.out.println("Nome do livro: ");
        livro.setNome(in.nextLine());
        System.out.println("Autor do livro: ");
        livro.setAutor(in.nextLine());
        System.out.println("Ano de Lançamento do Livro: ");
        livro.setAnoLancamento(in.nextInt());
        System.out.println("O valor que será cobrado pelo livro (acima de 100 tem desconto de 15%): ");
        livro.setValor(in.nextDouble());
        
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Agora, vamos ver os dados de seus cadastros e os mostrar na tela:");
        System.out.println("--------------------------Dados do Cliente-------------------------");
        System.out.println(cliente);
        System.out.println("--------------------------Dados do Livro---------------------------");
        System.out.println(livro);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Obrigado por usar nosso sistema. Tenha um bom dia.");
    }
    
}

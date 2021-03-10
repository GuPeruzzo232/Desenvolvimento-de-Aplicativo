
package Biblioteca;

public class Livro {
    
    private String nome;
    private String autor;
    private int anoLancamento;
    private double valor;
    
    public Livro(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String verificarPreco(){
        String respostaPreco;
        if(this.valor > 100){
            respostaPreco = "Desconto aplicável.";
        }else{
            respostaPreco = "Desconto não aplicável.";
        }
        return respostaPreco;
    }
    
    public double calcularDesconto(){
        double valorDesconto;
        if(this.valor > 100){
            valorDesconto = this.valor * 0.15;
        }else{
            valorDesconto = 0;
        }
        return valorDesconto;
    }
     
    public String toString(){
        return "Nome do livro: " + this.nome +
                "\nAutor do livro: " + this.autor +
                "\nAno de Lançamento: " + this.anoLancamento +
                "\nPreço: " + this.valor + 
                "\n-----Verificando Desconto-----" +
                "\n" + this.verificarPreco() +
                "\nValor do Desconto: " + this.calcularDesconto();
    }
    
}

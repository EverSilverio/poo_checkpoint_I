public class Vendedor extends Funcionario {
    public Vendedor(String tipoDocumento, String nroDocumento, String nome, String endereco, Double salarioBase) {
        super(tipoDocumento, nroDocumento, nome, endereco, salarioBase);
    }

    @Override
    public void calcularSalario() {
        System.out.println(this.name + " é vendedor da loja e o seu salario base é de " + this.salarioBase + " com um adicional de 1% do valor total das vendas");
    }
    public void realizarVenda() {
        System.out.println("O vendedor"+ this.name+ "pode lhe ajudar a comprar o produto ou receber seu aparelho");
    }
    public void revisarEstoque() {
        System.out.println("O vendedor "+ this.name+ " vai revisar o estoque dos produtos");
    }
}

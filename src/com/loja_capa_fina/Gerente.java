public class Gerente extends Funcionario {
    public Gerente(String tipoDocumento, String nroDocumento, String nome, String endereco, Double salarioBase) {
        super(tipoDocumento, nroDocumento, nome, endereco, salarioBase);
    }
    @Override
    public void calcularSalario() {
        System.out.println(this.name + " é o gerente da loja e o seu salario base é de " + this.salarioBase + " com um adicional de 0,5% do valor total das vendas");
    }
    public void organizarEquipe() {
        System.out.println("O gerente " + this.name + "Tem o papel de organizar a equipe da sua loja");
    }
    public void realizarContabilidade() {
        System.out.println("O gerente "+this.name+ " deve realizar a contabilidade da loja");
    }
    public void contatarFornecedor() {
        System.out.println("Em caso de falta de algum item da loja, o gerente "+ this.name+ " deve entrar em contato com o seu fornecedor");
    }
}

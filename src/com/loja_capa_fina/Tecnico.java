public class Tecnico extends Funcionario {
    public Tecnico(String tipoDocumento, String nroDocumento, String nome, String endereco, Double salarioBase) {
        super(tipoDocumento, nroDocumento, nome, endereco, salarioBase);
    }
    @Override
    public void calcularSalario() {
        System.out.println(this.name + " é técnico da loja e o seu salario base é de " + this.salarioBase + " com um adicional de 25% do valor por cada aparelho consertado");
    }
    public void avaliarAparelho() {
        System.out.println("Nosso técnico "+ this.name+ " realizara a avaliação do defeito no seu aparelho celular");
    }
    public void consertarAparelho() {
        System.out.println("O técnico " +this.name+ " está consertando seu aparelho");
    }
    public void calcularConserto() {
        System.out.println("O valor do conserto de seu aparelho é de 1000 reais, melhor compre um novo");
    }
}

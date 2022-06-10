public class Loja {

    private String endereco;
    private int telefone;
    private String cnpj;
    private String horario;

    public Loja(String endereco, int telefone, String cnpj, String horario) {
        this.endereco = endereco;
        this.telefone = telefone;
        this.cnpj = cnpj;
        this.horario = horario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}

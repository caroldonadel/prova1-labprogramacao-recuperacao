package labprogramacao.prova1.recuperacao;

public class Paciente {
    
    private String nome;
    private int telefone;
    private String email; 
    private String endereco;
    private String amostra;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getAmostra() {
        return amostra;
    }

    public void setAmostra(String amostra) {
        this.amostra = amostra;
    }

    @Override
    public String toString() {
        return nome + " - " + telefone + " - " + email + " - " +  endereco + " - " + amostra;
    }

}

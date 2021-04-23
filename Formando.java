import java.util.ArrayList;

public class Formando {
    private int idFormando;
    private String nome;
    private boolean masculino;
    private ArrayList<Integer> telefones = new ArrayList<>();

    public Formando() {
    }

    public int getIdFormando() {
        return idFormando;
    }

    public void setIdFormando(int idFormando) {
        this.idFormando = idFormando;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isMasculino() {
        return masculino;
    }

    public void setMasculino(boolean masculino) {
        this.masculino = masculino;
    }

    public ArrayList<Integer> getTelefones() {
        return telefones;
    }

    public void setTelefones(int telefone) {
        this.telefones.add(telefone);
    }

    @Override
    public String toString() {
        return "Formando{" +
                "idFormando=" + idFormando +
                ", nome='" + nome + '\'' +
                ", masculino=" + masculino +
                ", telefones=" + telefones +
                '}';
    }
}
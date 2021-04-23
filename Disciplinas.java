
import java.util.ArrayList;

public class Disciplinas {

    private int idDisciplinas;
    private String nome;
    private int horas;

    public Disciplinas(int idDisciplinas, String nome, int horas) {
        this.idDisciplinas = idDisciplinas;
        this.nome = nome;
        this.horas = horas;
    }

    public Disciplinas() {

    }

    public int getIdDisciplinas() {
        return idDisciplinas;
    }

    public void setIdDisciplinas(int idDisciplinas) {
        this.idDisciplinas = idDisciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Disciplinas [horas=" + horas + ", idDisciplinas=" + idDisciplinas + ", nome=" + nome + "]";
    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {

    static ArrayList<Formando> osFormandos = new ArrayList<>();
    static ArrayList<cursos> osCursos = new ArrayList<>();
    static ArrayList<Disciplinas> asDisciplinas = new ArrayList<>();
    static Continuar continuar = new Continuar();
    static int idCurso = 0;
    static int idFormando = 0;
    static int idDisciplinas = 0;

    public static void main(String[] args) {
        idCurso = 1;
        Scanner sc = new Scanner(System.in);
        ArrayList<Formando> lista = new ArrayList<>();
        showMenu menus = new showMenu();
        ArrayList<cursos> lista2 = new ArrayList<>();

        int escolha = 0;
        int escolhasec = 0;
        do {
            escolha = menus.showMenuPrincipal();
            switch (escolha) {
                case 1:
                    do {
                        escolhasec = menus.showMenuSecundário("Formando");
                        switch (escolhasec) {
                            case 1:
                                inserirFormando();
                                break;
                            case 2:
                                modificarFormando();
                                break;
                            case 3:
                                eliminarFormando();
                                System.out.println("Eliminar Formando");
                                break;
                            case 4:
                                for (Formando osFormandos : osFormandos) {
                                    System.out.println(osFormandos.toString());
                                }
                                break;
                        }
                    } while (escolhasec != 9);
                    break;
                case 2:
                    do {
                        escolhasec = menus.showMenuSecundário("Curso");
                        switch (escolhasec) {
                            case 1:
                                inserirCurso();
                                break;
                            case 2:
                                modificarCurso();
                                break;
                            case 3:
                                eliminarCurso();
                                System.out.println("Eliminar Curso");
                                break;
                            case 4:
                                for (cursos osCursos : osCursos) {
                                    System.out.println(osCursos.toString());
                                }
                                break;
                        }
                    } while (escolhasec != 9);
                    break;
                case 3:
                    do {
                        escolhasec = menus.showMenuSecundário("Disciplinas");
                        switch (escolhasec) {
                            case 1:
                                inserirDisciplinas();
                                break;
                            case 2:
                                modificarDisciplinas();
                                break;
                            case 3:
                                eliminarDisciplinas();
                                System.out.println("Eliminar Disciplina");
                                break;
                            case 4:
                                for (Disciplinas asDisciplinas : asDisciplinas) {
                                    System.out.println(asDisciplinas.toString());
                                }
                        }

                    } while (escolhasec != 9);
                    break;
            }
        } while (escolha != 9);

    }

    private static void inserirCurso() {

        Scanner sc = new Scanner(System.in);
        cursos cursos = new cursos();
        sc = new Scanner(System.in);
        cursos.setIdCurso(idCurso++);
        System.out.println("Nome do Curso:");
        cursos.setNome(sc.nextLine());
        System.out.println("Quantas horas:");
        cursos.setHoras(sc.nextInt());
        osCursos.add(cursos);
    }

    private static void inserirFormando() {
        int idFormando = 1;
        Scanner sc = new Scanner(System.in);
        Formando formando = new Formando();
        sc = new Scanner(System.in);
        formando.setIdFormando(idFormando++);
        System.out.println("Nome do formando:");
        formando.setNome(sc.nextLine());
        System.out.println("Masculino (True/False):");
        formando.setMasculino(sc.nextBoolean());
        do {
            System.out.println("Telefone:");
            formando.setTelefones(sc.nextInt());
        } while (continuar.perguntar());
        osFormandos.add(formando);
    }

    private static void modificarCurso() {
        if (osCursos.size() == 0) {
            System.out.println("Não há Cursos!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (cursos oCursos : osCursos) {
                System.out.println(oCursos.toString());
            }

            System.out.println("ID do Curso:");
            int id = sc.nextInt();
            try {
                cursos cursos = osCursos.get(id - 1);
                String nome = sc.nextLine();
                System.out.println("Nome do Curso:");
                cursos.setNome(sc.nextLine());
                if (!nome.isEmpty()) {
                    cursos.setNome(sc.nextLine());
                }

                System.out.println("Quantas horas:");
                cursos.setHoras(sc.nextInt());

            } catch (Exception e) {
                System.out.println("O Curso " + id + " não existe");
            }
        }
    }

    private static void modificarFormando() {
        if (osFormandos.size() == 0) {
            System.out.println("Não há formandos!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Formando oFormando : osFormandos) {
                System.out.println(oFormando.toString());
            }

            System.out.println("ID do formando:");
            int id = sc.nextInt();
            try {
                Formando formando = osFormandos.get(id - 1);
                String nome = sc.nextLine();
                System.out.println("Nome do formando:");
                formando.setNome(sc.nextLine());
                if (!nome.isEmpty()) {
                    formando.setNome(sc.nextLine());
                }

                System.out.println("Masculino (True/False):");
                formando.setMasculino(sc.nextBoolean());
                do {
                    System.out.println("Telefone:");
                    formando.setTelefones(sc.nextInt());
                } while (continuar.perguntar());

            } catch (Exception e) {
                System.out.println("O formando " + id + " não existe");
            }
        }
    }

    private static void eliminarCurso() {
        cursos curso = new cursos();
        if (osCursos.size() == 0) {
            System.out.println("Não há cursos!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (cursos oCurso : osCursos) {
                System.out.println(oCurso.toString());
            }
            sc = new Scanner(System.in);
            System.out.println("ID do curso que deseja eliminar?");
            int id = sc.nextInt();

            if (id > 0 && id <= osCursos.size()) {

                if (osCursos.size() == 0) {
                    System.out.println("Não há cursos!");

                } else {
                    osCursos.remove(id - 1);
                    idCurso = 2;
                    int j = osCursos.size();
                    for (int x = 2; x < j + 1; x++) {
                        curso = osCursos.get(x - 1);
                        curso.setIdCurso(idCurso++);
                    }

                    System.out.println("O curso com o ID " + id + " foi eliminado.");
                    for (cursos c : osCursos) {
                        System.out.println(c.toString());
                    }
                }
            } else {
                System.out.println("Não existe nenhum curso com o ID " + id);
            }
        }

    }

    private static void eliminarFormando() {
        Formando formando = new Formando();
        if (osFormandos.size() == 0) {
            System.out.println("Não há formandos!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Formando oFormando : osFormandos) {
                System.out.println(oFormando.toString());
            }
            sc = new Scanner(System.in);
            System.out.println("ID do formando que deseja eliminar?");
            int id = sc.nextInt();

            if (id > 0 && id <= osFormandos.size()) {

                if (osFormandos.size() == 0) {
                    System.out.println("Não há formandos!");

                } else {
                    osFormandos.remove(id - 1);
                    idFormando = 2;
                    int j = osFormandos.size();
                    for (int x = 2; x < j + 1; x++) {
                        formando = osFormandos.get(x - 1);
                        formando.setIdFormando(idFormando++);
                    }

                    System.out.println("O formando com o ID " + id + " foi eliminado.");
                    for (Formando f : osFormandos) {
                        System.out.println(f.toString());
                    }
                }
            } else {
                System.out.println("Não existe nenhum formando com o ID " + id);
            }
        }
    }

    private static void inserirDisciplinas() {

        Disciplinas disciplinas = new Disciplinas();
        Scanner sc = new Scanner(System.in);
        disciplinas.setIdDisciplinas(idDisciplinas++);
        System.out.println("Nome da Disciplina:");
        disciplinas.setNome(sc.nextLine());
        System.out.println("Quantas horas:");
        disciplinas.setHoras(sc.nextInt());
        asDisciplinas.add(disciplinas);

    }

    private static void eliminarDisciplinas() {
        Disciplinas disciplinas = new Disciplinas();
        if (asDisciplinas.size() == 0) {
            System.out.println("Não há Disciplinas!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Disciplinas asDisciplinas : asDisciplinas) {
                System.out.println(asDisciplinas.toString());
            }
            sc = new Scanner(System.in);
            System.out.println("ID do Disciplinas que deseja eliminar?");
            int id = sc.nextInt();

            if (id > 0 && id <= asDisciplinas.size()) {

                if (asDisciplinas.size() == 0) {
                    System.out.println("Não há Disciplinas!");

                } else {
                    asDisciplinas.remove(id - 1);
                    idDisciplinas = 2;
                    int j = asDisciplinas.size();
                    for (int x = 2; x < j + 1; x++) {
                        disciplinas = asDisciplinas.get(x - 1);
                        disciplinas.setIdDisciplinas(idDisciplinas++);
                    }

                    System.out.println("A Disciplinas com o ID " + id + " foi eliminado.");
                    for (Disciplinas d : asDisciplinas) {
                        System.out.println(d.toString());
                    }
                }
            } else {
                System.out.println("Não existe nenhuma Disciplinas com o ID " + id);
            }
        }
    }

    private static void modificarDisciplinas() {
        Disciplinas Disciplinas = new Disciplinas();
        if (asDisciplinas.size() == 0) {
            System.out.println("Não há Disciplinas!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Disciplinas disciplinas : asDisciplinas) {
                System.out.println(Disciplinas.toString());
            }
            sc = new Scanner(System.in);
            System.out.println("ID da Disciplinas que deseja eliminar?");
            int id = sc.nextInt();

            if (id > 0 && id <= asDisciplinas.size()) {

                if (asDisciplinas.size() == 0) {
                    System.out.println("Não há Disciplinas!");

                } else {
                    asDisciplinas.remove(id - 1);
                    idDisciplinas = 2;
                    int j = asDisciplinas.size();
                    for (int x = 2; x < j + 1; x++) {
                        Disciplinas = asDisciplinas.get(x - 1);
                        Disciplinas.setIdDisciplinas(idDisciplinas++);
                    }

                    System.out.println("A Disciplina com o ID " + id + " foi eliminado.");
                    for (Disciplinas d : asDisciplinas) {
                        System.out.println(d.toString());
                    }
                }
            } else {
                System.out.println("Não existe nenhuma Disciplinas com o ID " + id);
            }
        }

    }

    private static void inscricao() {
        
    }
}

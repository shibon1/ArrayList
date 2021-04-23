import java.util.Scanner;

public class showMenu {
    public int showMenuPrincipal() {
        int escolha = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("==========================");
            System.out.println("1. Formandos");
            System.out.println("2. Cursos");
            System.out.println("3. Disciplinas");
            System.out.println();
            System.out.println("9. Sair");
            System.out.println("==========================");
            System.out.print("Escolhe uma opção: ");
            escolha = sc.nextInt();
        }while(escolha != 1 && escolha != 2 && escolha != 3 && escolha != 9);
        return escolha;
    }
    public int showMenuSecundário(String tipo) {
        int escolha = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("==========================");
            System.out.println("1. Inserir " + tipo);
            System.out.println("2. Modificar " + tipo);
            System.out.println("3. Eliminar " + tipo);
            System.out.println("4. Listar " + tipo);
            System.out.println();
            System.out.println("9. Sair");
            System.out.println("==========================");
            System.out.print("Escolhe uma opção: ");
            escolha = sc.nextInt();
        }while(escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4 && escolha != 9);
        return escolha;
    }

}

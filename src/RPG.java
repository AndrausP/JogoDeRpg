import java.util.Scanner;

public class RPG {

    private Scanner scanner;

    public RPG() {
        this.scanner = new Scanner(System.in);
    }
    public void criarPersonagem() {
        System.out.println("Digite o nome do seu personagem:");
        String nome = scanner.nextLine();
        Personagem personagem = new Personagem(nome);

        escolherRaca(personagem);
        escolherSexo(personagem);
        escolherClasse(personagem);
        exibirConfirmacao(personagem);



    }

    private void escolherRaca(Personagem personagem) {
        System.out.println("Escolha a raça do seu personagem:");
        System.out.println("1. Humano");
        System.out.println("2. Elfo");
        System.out.println("3. Anão");
        System.out.println("4. Orc");
        System.out.println("5. Gnomo");

        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha

        switch (escolha) {
            case 1 -> personagem.setRaca(new Humano());
            case 2 -> personagem.setRaca(new Elfo());
            case 3 -> personagem.setRaca(new Anao());
            case 4 -> personagem.setRaca(new Orc());
            case 5 -> personagem.setRaca(new Gnomo());
            default -> {
                System.out.println("Escolha inválida. Tente novamente.");
                escolherRaca(personagem);
            }
        }
    }

    private void escolherSexo(Personagem personagem) {
        System.out.println("Escolha o sexo do seu personagem:");
        System.out.println("1. Masculino");
        System.out.println("2. Feminino");
        System.out.println("3. Outro");

        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha

        switch (escolha) {
            case 1 -> personagem.setSexo("Masculino");
            case 2 -> personagem.setSexo("Feminino");
            case 3 -> personagem.setSexo("Outro");
            default -> {
                System.out.println("Escolha inválida. Tente novamente.");
                escolherSexo(personagem);
            }
        }
    }

    private void escolherClasse(Personagem personagem) {
        System.out.println("Escolha a classe do seu personagem:");
        System.out.println("1. Guerreiro");
        System.out.println("2. Mago");
        System.out.println("3. Arqueiro");
        System.out.println("4. Ladino");
        System.out.println("5. Clérigo");

        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha

        switch (escolha) {
            case 1 -> personagem.setClasse(new Guerreiro());
            case 2 -> personagem.setClasse(new Mago());
            case 3 -> personagem.setClasse(new Arqueiro());
            case 4 -> personagem.setClasse(new Ladino());
            case 5 -> personagem.setClasse(new Clerigo());
            default -> {
                System.out.println("Escolha inválida. Tente novamente.");
                escolherClasse(personagem);
            }
        }
    }
    private void exibirConfirmacao(Personagem personagem) {
        System.out.println("Personagem criado com sucesso!");
        System.out.println("Nome: " + personagem.getNome());
        System.out.println("Raça: " + personagem.getRaca());
        System.out.println("Classe: " + personagem.getClasse());
        System.out.println("Nivel: " + personagem.getNivel());
        System.out.println("Força: " + personagem.getForca());
        System.out.println("Destreza: " + personagem.getDestreza());
        System.out.println("Inteligência: " + personagem.getInteligencia());
        System.out.println("Vida: " + personagem.getVida());
    }
}

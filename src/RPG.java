import java.util.Scanner;

public class RPG {

    private Scanner scanner;

    public RPG() {
        this.scanner = new Scanner(System.in);
    }
    public Personagem criarPersonagem() {
        System.out.println("Digite o nome do seu personagem:");
        String nome = scanner.nextLine();
        Personagem personagem = new Personagem(nome);

        escolherRaca(personagem);
        escolherSexo(personagem);
        escolherClasse(personagem);
        exibirConfirmacao(personagem);


        return personagem;
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
        System.out.println("Habilidade 1 : " + personagem.getClasse().getNomeHabilidade1());
        System.out.println("Habilidade 2 : " + personagem.getClasse().getNomeHabilidade2());
    }
    public Monstro criarMonstro(){
        Monstro monstro = new Monstro();
        return monstro;
    }

    public void iniciarBatalha(Personagem heroi, Monstro monstro) {
        while (heroi.getVida() > 0 && monstro.getVidaMonstro() > 0) {
            // Turno do herói
            System.out.println("-----------------");
            System.out.println("Enquanto estava andando pela floreste um monstro aparece, Glacios o monstro de gelo aparece para te atacar, o que você faz ?");
            System.out.println("-----------------");


            System.out.println("Escolha uma habilidade:");
            System.out.println("1. " + heroi.getClasse().getNomeHabilidade1());
            System.out.println("2. " + heroi.getClasse().getNomeHabilidade2());
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1 -> heroi.getClasse().habilidadeEspecial1( heroi, monstro);
                case 2 -> heroi.getClasse().habilidadeEspecial2( heroi, monstro);

                default -> System.out.println("Escolha inválida!");
            }

            // Turno do monstro, se ainda estiver vivo
            if (monstro.getVidaMonstro() > 0) {
                monstro.monstroAtaquePersonagem(heroi);
            }
        }

        if (heroi.getVida() <= 0) {
            System.out.println("Você perdeu!");
        } else if (monstro.getVidaMonstro() <= 0) {
            System.out.println("Você venceu!");
        }
    }
    public static void main(String[] args) { //inciar a aplicação por aqui

        RPG novojogo = new RPG();
        Personagem heroi = novojogo.criarPersonagem();

        RPG novomonstro = new RPG();
        Monstro monstro = novomonstro.criarMonstro();

        novojogo.iniciarBatalha(heroi, monstro);

    }


}


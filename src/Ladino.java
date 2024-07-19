public class Ladino implements ClasseMae{

    public String getClasse() {
        return "Ladino";
    }
    public String toString() {
        return getClasse();
    }
    @Override
    public void aplicarBonusDeClasse(Personagem personagem) {
        personagem.setDestreza(personagem.getDestreza() + 10 );
        personagem.setInteligencia(personagem.getInteligencia() + 10 );
    }

    @Override
    public void habilidadeEspecial2(Personagem heroi, Monstro monstro) {
        System.out.println("Você usou o Golpe Estrategico.");
        monstro.setVidaMonstro(monstro.getVidaMonstro() - 10);
        System.out.println("Você atacou o Monstro e causou 10 pontos de dano !");
        System.out.println("Vida do Monstro: " + monstro.getVidaMonstro());

    }

    @Override
    public String getNomeHabilidade1() {
        return "Hiper Foco - AUMENTA SUA DESTREZA EM 15 PONTOS";
    }

    @Override
    public String getNomeHabilidade2() {
        return "Golpe Estrategico - CAUSA 10 DE DANO";
    }

    @Override
    public void habilidadeEspecial1(Personagem heroi, Monstro monstro) {
        System.out.println("Você usou a Hiper Foco.");
        heroi.setDestreza(heroi.getDestreza() + 15);
        System.out.println("Você ganhou mais 15 pontos de destreza !");
    }
}

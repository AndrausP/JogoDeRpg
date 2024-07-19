public class Mago  implements ClasseMae{
    public String getClasse() {
        return "Mago";
    }
    public String toString() {
        return getClasse();
    }
    @Override
    public void aplicarBonusDeClasse(Personagem personagem) {
        personagem.setDestreza(personagem.getDestreza() + 15);
        personagem.setInteligencia(personagem.getInteligencia() + 20 );
    }

    @Override
    public void habilidadeEspecial1(Personagem heroi, Monstro monstro) {
        System.out.println("Você usou a magia Bola de Fogo.");
        monstro.setVidaMonstro(monstro.getVidaMonstro() - 25);
        System.out.println("Você atacou o Monstro e causou 25 pontos de dano !");
        System.out.println("Vida do Monstro: " + monstro.getVidaMonstro());
    }

    @Override
    public void habilidadeEspecial2(Personagem heroi, Monstro monstro) {
        System.out.println("Você usou a Magia de Cura.");
        heroi.setVida(heroi.getVida() + 25);
        System.out.println("Você se curou em 25 pontos de vida !");
    }

    @Override
    public String getNomeHabilidade1() {
        return "Bola de Fogo - CAUSA 25 DE DANO";
    }

    @Override
    public String getNomeHabilidade2() {
        return "Magia de Cura - TE CURA EM 25 DE VIDA";
    }
}

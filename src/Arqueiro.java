public class Arqueiro implements ClasseMae{
    public String getClasse() {
        return "Arqueiro";
    }
    public String toString() {
        return getClasse();
    }
    @Override
    public void aplicarBonusDeClasse(Personagem personagem) {
        personagem.setDestreza(personagem.getDestreza() + 20);
    }

    @Override
    public void habilidadeEspecial2(Personagem heroi, Monstro monstro) {
        System.out.println("Você usou o Flechas Perfurantes.");
        monstro.setVidaMonstro(monstro.getVidaMonstro() - 25);
        System.out.println("Você atacou o Monstro e causou 25 pontos de dano !");
    }

    @Override
    public String getNomeHabilidade1() {
        return "Poção de Cura - TE CURA EM 20 DE VIDA";
    }

    @Override
    public String getNomeHabilidade2() {
        return "Flechas Perfurantes - CAUSA 25 DE DANO";
    }

    @Override
    public void habilidadeEspecial1(Personagem heroi, Monstro monstro) {
        System.out.println("Você usou uma Poção de Cura.");
        heroi.setVida(heroi.getVida() + 20);
        System.out.println("Você se curou em 20 pontos de vida !");
    }
}

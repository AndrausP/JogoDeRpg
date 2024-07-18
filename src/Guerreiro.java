public class Guerreiro implements ClasseMae{

    public String getClasse() {
        return "Guerreiro";
    }
    public String toString() {
        return getClasse();
    }
    @Override
    public void aplicarBonusDeClasse(Personagem personagem) {
        personagem.setForca(personagem.getForca() + 8);
        personagem.setVida(personagem.getVida() + 10 );
    }

    @Override
    public void habilidadeEspecial1(Personagem personagem, Monstro monstro) {
        System.out.println("Você usou o Ataque de Trovoada.");
        monstro.setVidaMonstro(monstro.getVidaMonstro() - 15);
        System.out.println("Você atacou o Monstro e causou 15 pontos de dano !");
    }

    @Override
    public void habilidadeEspecial2(Personagem personagem, Monstro monstro) {
                System.out.println("Você usou a Cura Divina.");
                personagem.setVida(personagem.getVida() + 15);
                System.out.println("Você se curou em 15 pontos de vida !");
    }

    @Override
    public String getNomeHabilidade1() {
        return "Ataque de Trovoada - CAUSA 15 DE DANO";
    }

    @Override
    public String getNomeHabilidade2() {
        return "Cura Divina - TE CURA EM 15 DE VIDA";
    }
}

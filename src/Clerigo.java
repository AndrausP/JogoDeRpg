public class Clerigo implements ClasseMae{
    public String getClasse() {
        return "Clerigo";
    }
    public String toString() {
        return getClasse();
    }
    @Override
    public void aplicarBonusDeClasse(Personagem personagem) {
        personagem.setInteligencia(personagem.getInteligencia() + 5);
        personagem.setVida(personagem.getVida() + 10);
    }

    @Override
    public void habilidadeEspecial2(Personagem personagem, Monstro monstro) {
        System.out.println("Você usou a Benção divina.");
        personagem.setVida(personagem.getVida() + 30);
        System.out.println("Você se curou em 30 pontos de vida !");
    }

    @Override
    public String getNomeHabilidade1() {
        return "Ataque dos Deuses - CAUSA 10 DE DANO";
    }

    @Override
    public String getNomeHabilidade2() {
        return "Benção Divina - TE CURA EM 30 DE VIDA";
    }

    @Override
    public void habilidadeEspecial1(Personagem personagem, Monstro monstro) {
        System.out.println("Você usou o Ataque dos Deuses.");
        monstro.setVidaMonstro(monstro.getVidaMonstro() - 10);
        System.out.println("Você atacou o Monstro e causou 10 pontos de dano !");

    }
}

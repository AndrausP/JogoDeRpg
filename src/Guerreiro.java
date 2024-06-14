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
    public void habilidadeEspecial(Personagem personagem) {

    }
}

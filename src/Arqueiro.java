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
    public void habilidadeEspecial(Personagem personagem) {

    }
}

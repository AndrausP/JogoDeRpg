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
    public void habilidadeEspecial(Personagem personagem) {

    }
}

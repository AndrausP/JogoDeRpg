public class Anao implements Raca{
    public String getNome() {
        return "Anão";
    }
    @Override
    public String getRaca() {
        return null;
    }
    public String toString() {
        return getNome();
    }
    @Override
    public void aplicarBonusRacial(Personagem personagem) {
        personagem.setVida(personagem.getVida() + 20);
        personagem.setDestreza(personagem.getDestreza() + 5);
        personagem.setForca(personagem.getForca() + 5);
    }
}

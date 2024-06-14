public class Humano implements Raca{
    public String getNome() {
        return "Humano";
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
        personagem.setInteligencia(personagem.getInteligencia() + 3);
        personagem.setForca(personagem.getForca() + 3);
        personagem.setVida(personagem.getVida() + 5);
        personagem.setDestreza(personagem.getDestreza() + 8);
    }
}

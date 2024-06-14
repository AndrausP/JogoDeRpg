public class Gnomo implements Raca{
    public String getNome() {
        return "Gnomo";
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
        personagem.setInteligencia(personagem.getInteligencia() + 5);
        personagem.setForca(personagem.getForca() - 5);

    }
}

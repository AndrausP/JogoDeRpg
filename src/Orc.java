public class Orc implements Raca{

    public String getNome() {
        return "Orc";
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
                personagem.setForca(personagem.getForca() + 5);
                personagem.setInteligencia(personagem.getInteligencia() - 1);
                personagem.setVida(personagem.getVida() + 15);
    }
}

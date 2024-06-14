public class Elfo implements Raca{
    public String getNome() {
        return "Elfo";
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
        personagem.setDestreza(personagem.getDestreza() + 15);
        personagem.setInteligencia(personagem.getInteligencia() + 20);

    }
}

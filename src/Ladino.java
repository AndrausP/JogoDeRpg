public class Ladino implements ClasseMae{

    public String getClasse() {
        return "Ladino";
    }
    public String toString() {
        return getClasse();
    }
    @Override
    public void aplicarBonusDeClasse(Personagem personagem) {
        personagem.setDestreza(personagem.getDestreza() + 10 );
        personagem.setInteligencia(personagem.getInteligencia() + 10 );
    }

    @Override
    public void habilidadeEspecial(Personagem personagem) {

    }
}

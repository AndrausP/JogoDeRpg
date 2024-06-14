public class Mago  implements ClasseMae{
    public String getClasse() {
        return "Mago";
    }
    public String toString() {
        return getClasse();
    }
    @Override
    public void aplicarBonusDeClasse(Personagem personagem) {
        personagem.setDestreza(personagem.getDestreza() + 15);
        personagem.setInteligencia(personagem.getInteligencia() + 20 );
    }

    @Override
    public void habilidadeEspecial(Personagem personagem) {

    }
}

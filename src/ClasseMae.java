public interface ClasseMae {

        String getClasse();
        public String toString();
        void aplicarBonusDeClasse(Personagem personagem);
        void habilidadeEspecial1(Personagem personagem, Monstro monstro);
        void habilidadeEspecial2(Personagem personagem, Monstro monstro);

        String getNomeHabilidade1();
        String getNomeHabilidade2();

        int escolhaAtaque();

}

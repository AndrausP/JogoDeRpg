public class Personagem extends Monstro{
    private String nome;


    private String sexo;
    private int nivel;
    private int forca;
    private int destreza;
    private int inteligencia;
    private int vida;
    private int mana;


    private ClasseMae classe;

    public void setClasse(ClasseMae classe) {
        this.classe = classe;
        classe.aplicarBonusDeClasse(this);
        classe.habilidadeEspecial1(this, this);
        classe.habilidadeEspecial2(this, this);
    }

    public ClasseMae getClasse() {
        return classe;
    }


    private Raca raca;

    public void setRaca(Raca raca) {
        this.raca = raca;
        raca.aplicarBonusRacial(this);
    }

    public Raca getRaca() {
        return raca;
    }


    public Personagem(String nome) {
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
        this.sexo = sexo;
        this.nivel = 1;
        this.forca = 10;
        this.destreza = 10;
        this.inteligencia = 10;
        this.vida = 100;
        this.mana = 100;
    }

    public int getMana() {
        return mana;
    }

    public void setMana() {
        this.mana = mana;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}



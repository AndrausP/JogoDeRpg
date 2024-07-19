public class Monstro {
  private String nomeMonstro = "Glacios";
  private int vidaMonstro = 180;

  private int monstroAtaque = 15;

  public void monstroAtaquePersonagem(Personagem heroi){
      System.out.println("-----------------");
      System.out.println("Glacios te bateu !!");
      heroi.setVida(heroi.getVida() - monstroAtaque);
      System.out.println("Vida do personagem: " + heroi.getVida());
      System.out.println("-----------------");

  }

    public String getNomeMonstro() {
        return nomeMonstro;
    }

    public void setNomeMonstro(String nomeMonstro) {
        this.nomeMonstro = nomeMonstro;
    }

    public int getVidaMonstro() {
        return vidaMonstro;
    }

    public void setVidaMonstro(int vidaMonstro) {
        this.vidaMonstro = vidaMonstro;
    }

    public int getMonstroAtaque() {
        return monstroAtaque;
    }

    public void setMonstroAtaque(int monstroAtaque) {
        this.monstroAtaque = monstroAtaque;
    }

    public void status(){

    }


}

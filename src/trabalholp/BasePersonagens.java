package trabalholp;

public class BasePersonagens {
    private int vida;
    private int dano;
    
    public BasePersonagens(int vida, int dano) {
        this.vida = vida;
        this.dano = dano;
    }
    
    public void Atacar() {
        
    }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
  
}

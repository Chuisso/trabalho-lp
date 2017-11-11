package trabalholp;

public class BasePersonagens {
    protected int vida;
    protected int vidaMax;
    
    private int dano;
    
    public BasePersonagens(int vida, int dano) {
        this.vida = vida;
        this.vidaMax = vida;
        this.dano = dano;
    }
    
    public void Atacar(BasePersonagens inimigo) {
        inimigo.addVida(vida);
    }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public void addVida(int qntd) {
        int vidaNova = vida-qntd;
        if(vidaNova > vidaMax) {
            vida = vidaMax;
        }
        else if(vidaNova <= 0) {
            vida = 0;
        }
        else {
            vida += qntd;
        }
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
  
}

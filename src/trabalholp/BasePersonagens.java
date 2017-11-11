package trabalholp;

import java.util.Random;

public class BasePersonagens {
    protected int vida;
    protected int vidaMax;
    
    
    public BasePersonagens(int vida) {
        this.vida = vida;
        this.vidaMax = vida;   
    }
    
    protected int atacar(BasePersonagens inimigo, double danoMin, double danoMax) {
        Random rand = new Random();
        
        float dano;
        do {
            dano = Math.round(rand.nextInt((int)Math.round(danoMax))+1);
        } while (dano < danoMin);
        
        inimigo.addVida(-Math.round(dano));
        return Math.round(dano);
    }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public void addVida(int qntd) {
        int vidaNova = vida+qntd;
        if(vidaNova > vidaMax) {
            vida = vidaMax;
        }
        else if(vidaNova < 0) {
            vida = 0;
        }
        else {
            vida += qntd;
        }
    }
  
}

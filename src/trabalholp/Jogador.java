package trabalholp;

public class Jogador extends BasePersonagens {
    
    public Jogador(int vida) {
        super(vida);
    }
    
    public int soco(BasePersonagens inimigo) {
        return atacar(inimigo, 5*1.3, 10*1.5);
    }
}

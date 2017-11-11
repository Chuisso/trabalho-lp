package trabalholp;

public class TrabalhoLP {

    public static void main(String[] args) {
        Jogador personagem = new Jogador(100);
        BasePersonagens inimigo = new BasePersonagens(10);
        int dano = personagem.soco(inimigo);
        System.out.println(inimigo.getVida());
        System.out.println(dano);
    }
    
}

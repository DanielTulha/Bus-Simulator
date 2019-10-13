//Daniel Tulha Hochstetler - 10892589
//José Luiz Borin Junior - 10723670
//Levi de Oliveira Fernandes - 10724250


package linha.de.onibus;

import java.util.Random;

public class Passageiro {
    
    private int tempo_embarque, origem, destino;
    
    Random rn = new Random();
    

    public int getTempo_embarque() {
        return tempo_embarque;
    }
    
    public int getOrigem() {
        return origem;
    }
    
    public int getDestino() {
        return destino;
    }
    
    public Passageiro(int origem, int destino)
    {
        this.tempo_embarque = rn.nextInt(15)+5;
        this.origem = origem;
        this.destino = destino; 
        
        
        if(rn.nextInt(100)<5)
        {
            this.tempo_embarque *= 4;
        }
    }
    
    
    
}

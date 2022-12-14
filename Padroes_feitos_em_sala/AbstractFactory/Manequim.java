
public class Manequim {
    RoupaTronco tronco;
    RoupaPernas pernas;
    RoupaPes pes;

    public Manequim() {
        System.out.println("Manequim sem roupa.\n");
    }

    public void colocarRoupa(FactoryRoupa trajeRoupa) {
        System.out.println("Manequim com roupa.\n");
        this.tronco = trajeRoupa.criarRoupaTronco();
        this.pernas = trajeRoupa.criarRoupaPernas();
        this.pes = trajeRoupa.criarRoupaPes();
    }

}

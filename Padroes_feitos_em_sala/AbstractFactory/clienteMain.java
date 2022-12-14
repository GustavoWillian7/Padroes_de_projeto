public class clienteMain {

    public static void main(String[] args) {
       //FactoryRoupa trajeRoupaFormal = new TrajeFactoryFormal();
       //FactoryRoupa trajeRoupaCasual = new TrajeFactoryCasual();
       FactoryRoupa trajeRoupa = FactoryRoupa.getFactory("Formal");
       Manequim manequim = new Manequim();
       System.out.println("TRAJE FORMAL: \n");
       manequim.colocarRoupa(trajeRoupa);
       System.out.println("\nFIM DO TRAJE FORMAL.");
       System.out.println("====================");
       trajeRoupa = FactoryRoupa.getFactory("Casual");
       System.out.println("TRAJE CASUAL: \n");
       manequim.colocarRoupa(trajeRoupa);
       System.out.println("\nFIM DO TRAJE CASUAL.");
       System.out.println("====================");
    }
}
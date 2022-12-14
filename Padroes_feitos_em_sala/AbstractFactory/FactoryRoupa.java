
public abstract class FactoryRoupa {
    static FactoryRoupa fabricaDeRoupa;
    public static FactoryRoupa getFactory(String tipoDeRoupa) {
        if (fabricaDeRoupa == null) {
            if (tipoDeRoupa.equals("Formal"))
                return new TrajeFactoryFormal();
            if (tipoDeRoupa.equals("Casual"))
                return new TrajeFactoryCasual();
        }
        return fabricaDeRoupa;
    }
    public abstract RoupaTronco criarRoupaTronco();
    public abstract RoupaPernas criarRoupaPernas();
    public abstract RoupaPes criarRoupaPes();
}


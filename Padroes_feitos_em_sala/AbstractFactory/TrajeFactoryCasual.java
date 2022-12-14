public class TrajeFactoryCasual extends FactoryRoupa{

    @Override
    public RoupaTronco criarRoupaTronco() {
        // TODO Auto-generated method stub
        return new Camiseta();
    }

    @Override
    public RoupaPernas criarRoupaPernas() {
        // TODO Auto-generated method stub
        return new Bermuda();
    }

    @Override
    public RoupaPes criarRoupaPes() {
        // TODO Auto-generated method stub
        return new Chinelo();
    }
    
}

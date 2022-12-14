public class TrajeFactoryFormal extends FactoryRoupa{

    @Override
    public RoupaTronco criarRoupaTronco() {
        // TODO Auto-generated method stub
        return new Camisa();
    }

    @Override
    public RoupaPernas criarRoupaPernas() {
        // TODO Auto-generated method stub
        return new Calca();
    }

    @Override
    public RoupaPes criarRoupaPes() {
        // TODO Auto-generated method stub
        return new Sapato();
    }
    
}

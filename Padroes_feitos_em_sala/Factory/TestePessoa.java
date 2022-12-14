public class TestePessoa {
    public static void main(String[] args) {
        FactoryPessoa factory = FactoryPessoa.getFactory();
        factory.getPessoa("João", "M");
        factory.getPessoa("Ana", "F");
    }
}
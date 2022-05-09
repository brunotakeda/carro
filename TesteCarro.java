public class TesteCarro {

    public static void main(String [] args){
        Carro carro =new Carro ();
        carro.setMarca("Fiat");
        carro.setModelo("Palio");
        carro.setPlaca("edd-2503");
        carro.setRenaVam(12345678);

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getPlaca());
        System.out.println(carro.getRenaVam());
    }
}
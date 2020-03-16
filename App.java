//Segunda versão
public class App{
    public static void main(String args[]){
        Placa p1 = new Placa("Italia","ABC1R23");
        
        Veiculo v = new Veiculo(p1);

        v.abastece(65);
        v.dirige(250);
        System.out.println("Dados do veiculo:");
        System.out.println(v);
        System.out.println("----------------");
        }
}

public class main {
    public static void main(String[] args){
        Carro miCarro=();
        miCarro.Puerta1();
        miCarro.puerta2();
        miCarro.puerta3();
        miCarro.puerta4();
        System.out.println(miCarro.puertas);
    }

}

class carro{
    public int puertas =0;
    public void puerta(){
        this.puertas--;
    }
}

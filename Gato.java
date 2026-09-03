public class Gato extends MascotaVirtual {

 public Gato (String nombreElegido){

    super(nombreElegido);
 }

    @Override

    public void hacerSonido(){
        System.out.println(nombre + "dice: MIAUW");
    }
    
    @Override
    public void dibujar(){
        System.out.println( Colores.VERDE);
        System.out.println("     /\\ _ /\\");
        System.out.println("    ( o . o )");
         System.out.println("      >   < ");
         System.out.println(Colores.RESET);
    }


}

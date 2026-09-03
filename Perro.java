public class Perro extends MascotaVirtual {
    
    public Perro(String nombreElegido){
        super(nombreElegido);
        
    }

   @Override
    public void hacerSonido(){
        System.out.println(nombre + "dice:GUAU");
    }
}

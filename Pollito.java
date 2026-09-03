public class Pollito extends MascotaVirtual {
     
    public Pollito (String nombreElegido){
        super(nombreElegido);
    }

    @Override
    public void hacerSonido(){
        System.out.println(nombre + "dice: PIO PIO");
    }

    

    
}

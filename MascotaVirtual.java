
 public class MascotaVirtual {
    protected String nombre;
    private Integer energia;
    public  String color; 
    private Integer felicidad;
                       
    public void ladrar () {
    }
    public void jugar () {    
    }

    public void setEnergia(){

    }

    private void recuperarEnergia(){
    }

    private void ajustarFelicidad(){
    }


    public void setEnergia(Integer energiaElegida){
        if (energiaElegida>100)
            System.out.println( "ERROR:la energia debe estar 1-100");
        else
            energia=energiaElegida;
    }

        public void getEnergia(){
            System.out.println( "El nivel de energia de");
            System.out.println(nombre);
            System.out.println("es de");
            System.out.println(energia);
        }

    public  MascotaVirtual (String nombreElegido) {
        nombre= nombreElegido ;
        energia=100;
        felicidad=100;
        System.out.print ("Bienvenido al mundo");
        System.out.println(nombreElegido);
    }
    public void salta() {
        System.out.println ("la mascota virtual esta saltando");
        energia=energia-5;
        System.out.print("El nivel de energia bajo a hora es");
        System.out.println(energia);

    }
    public void dormir() {
      
        if(!necesitaDescanso()){ 
            System.out.print(nombre+ "no tiene sueño");
            return;
     }
        recuperarEnergia(50);
        ajustarFelicidad(5);
        System.out.println(nombre+ "durmio y se renovo");

      }

      public void Saludar (MascotaVirtual quienSaludar){
        System.out.println(   "hola saludos");
        System.out.println(quienSaludar.nombre);
        System.out.println( "que hay de nuevo");

      }


    public void comer() {
     System.out.println("la mascota esta comiendo");
     energia=energia-3;
     System.out.println ("El nivel de energia sube a ") ;
     System.out.println(energia);     
    }

    private void recuperarEnergia(int puntos){
        setEnergia(energia + puntos);
    }

    private boolean necesitaDescanso() {
         
        return energia <30;
    }

    private void ajustarFelicidad(int puntos){
        felicidad = felicidad + puntos;
        if(felicidad>100) felicidad=100;
        if(felicidad<0) felicidad=0;
    }


    public void hacerSonido(){
        System.out.println(nombre + "hace un sonido");
    }

  public void mostrarEstado(){
    System.out.println(nombre);
    System.out.println("Energia; [ " + barra(energia)+ "]");
    System.out.println("Felicidad:[" + barra(felicidad)+ "]");
  }

  private String barra( int valor){
           String color ;
           if( valor>=60)  
               color= Colores.VERDE;
            else if(valor>=30)
                    color= Colores.AMARILLO;
                else 
                    color=Colores.ROJO;
   
    int llenos= valor/10;

    return  color+ "\u2588".repeat(llenos)+ "\u2591".repeat(10-llenos)+ " "+ Colores.RESET + valor;
  }


public void dibujar(){
    System.out.println("¿?");
    System.out.println("(¿?) <- mascota desconocida");
}


 }






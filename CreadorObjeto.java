 public class CreadorObjeto {

     public static void main (String [] args) {
     
         MascotaVirtual  [] refugio={
           new Perro("dana"),
           new Gato("michito"),
           new Perro("doki"),
           new Pollito("poito")

         };


         for (MascotaVirtual m : refugio){
             m.hacerSonido();
             m.mostrarEstado();
             m.dibujar();
         }

          

     } 

          
      }
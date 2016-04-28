package ejemplopolimorfismo;

import java.util.ArrayList;

public class EjemploPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList <Animal> listaAnimales = new ArrayList();
       Animal can = new Can("Kiara"," Palleiro");
       Animal gato = new Gato("Peludo"," negro");
       listaAnimales.add(can);
       listaAnimales.add(gato);
       for(Animal ani:listaAnimales)
            System.out.println(ani.toString());
       for(Animal ani:listaAnimales){
           ani.falar();
           if(ani instanceof Can)
               ((Can)ani).andar();
                       }
        for(Animal ani:listaAnimales)
           falarPolimorfico(ani);
        IAnimal canciño = new Can("Tobi","Pastor");
        System.out.println("*******");
        falarPolimorfico(canciño);
        System.out.println(canciño.toString());
        System.out.println(((Can)canciño).toString());
        Reloxo cuco = new ReloxoCuco();
        falarPolimorfico(cuco);
        
        //Referenciando a la interfaz :
        IAnimal cuc = new ReloxoCuco();
        falarPolimorfico(cuc);
        
        
    }
    //metodo con parametro generalista
    public static void falarPolimorfico(IAnimal a){
        a.falar();
        
        
    }
    
}
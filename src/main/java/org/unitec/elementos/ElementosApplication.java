package org.unitec.elementos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



//  #2 implements command aplicar metodos
@SpringBootApplication
public class ElementosApplication implements CommandLineRunner {
    
    // #3 se crea un repo para inyeccion de dependencias
    @Autowired
    RepoUsuario repoU;
    
    
    

	public static void main(String[] args) {
		SpringApplication.run(ElementosApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        // aqui ran todas nuestra prubas sin nesecidad de unaintefaz
        // ijeccion de dependecias 
            // ocultar el codigo comenta y solo expone codigo general
            //invercion de control  
        

//#4
      //  repoU.save(new Usuario(3, "Minina"));
    //clase 10   /
    
          for(Usuario u:repoU.findAll()){
          
              System.out.println(u);
         }
       
            
           //System.out.println(repoU.findById(2).get());
           
           
          //repoU.save(new Usuario(4,"Raymundo"));
           //System.out.println(repoU.findById(1).get());
          // repoU.deleteById(1);
          
         
          /*
          for(Usuario u: repoU.findByNombre("Juan Dainiz")){
          
              System.out.println(u);
          }*/
           
    }

}

/*
System.out.print("\nOcupantes: ");
                int ocupantes =coche.nextInt();



*/
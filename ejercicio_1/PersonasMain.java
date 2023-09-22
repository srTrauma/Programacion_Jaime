package ejercicio_1;
public class PersonasMain {
      public static void main(String[] args) {
            PersonaSinSout personNoSout = new PersonaSinSout();
            PersonaConSout personWithSout = new PersonaConSout();

            System.out.println(personNoSout.hablaSinDevlover("Pepito")); 
            personWithSout.hablaConSout("Jose");

      }
}

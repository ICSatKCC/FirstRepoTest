
/*
 * A driver class for testing Pokemon objects.
 * Makes an array of Pokemon, then prints them all.
 * @author Lisa Miller
 * @version 1.0
 * @since 7/20/2016
 */
public class PokedexArray{
   public static void main(String[ ] args){
      
      int arrLen = 20;//fixed array length
      
      Pokemon[] pokedex = new Pokemon[arrLen];//array of Pokemon objects

      //put in first 10 Pokemon
      pokedex[0] = new Pokemon("Bulbasaur", 1, "Grass", "Poison");
      pokedex[1] = new Pokemon("Ivysaur",  "Lisa's",2, "Grass", "Poison");
      pokedex[2] = new Pokemon("Venusaur", "Lisa's Venusaur", 3, "Grass", "Poison");
      pokedex[3] = new Pokemon("Charmander", "Lisa's Charmander", 4, "Fire", "");
      pokedex[4] = new Pokemon("Charmeleon", 5, "Fire", "");
      pokedex[5] = new Pokemon("Charizard", 6, "Fire", "Flying");
      pokedex[6] = new Pokemon("Squirtle",  "My Squirtly",7, "Water", "");
      pokedex[7] = new Pokemon("Wartortle", 8, "Water", "");
      pokedex[8] = new Pokemon("Blastoise", "Blaster", 9, "Water", "");
      pokedex[9] = new Pokemon("Caterpie", 10, "Bug", "");
      
      for( int i = 0; i < 10; i++){
         System.out.println(pokedex[i].toString());
      }
      
      //test exceptions
      System.out.print("Testing empty type: ");
      try{
         pokedex[10] = new Pokemon("Metapod", 11,"","");
      }catch(PokemonException pe){
         System.out.println(pe.getMessage());
      }
      System.out.print("Testing empty name: ");
      try{
         pokedex[10] = new Pokemon("", 11,"","");
      }catch(PokemonException pe){
         System.out.println(pe.getMessage());
      }
      System.out.print("Testing number out of range: ");
      try{
         pokedex[10] = new Pokemon("Metapod", 0 ,"Bug","");
      }catch(PokemonException pe){
         System.out.println(pe.getMessage());
      }    
      
   }
}
package liste;

public class Elem {
   int inf;
   Elem next;
   
   public Elem(){
       inf = 0;
       next = null;
   }
   
   public Elem (int i, Elem e){
       inf = i;
       next = e;
   }
}

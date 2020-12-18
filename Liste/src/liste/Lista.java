package liste;

public class Lista {
    Elem t; 
    public Lista(){
        t = null;
    }
    
    public void inserisciInTesta(int info)
    {
       t = new Elem(info,t);
    }
    
    public void inserisciInCoda(int info)
    {
        if (t==null)
        {
            inserisciInTesta(info);
            return; 
        }
        Elem e = t;
        while (e.next!=null)
           e = e.next;
        e.next = new Elem(info,null);
        
    }
    
    public int lunghezza()
    {
       Elem e = t; 
       int contatore = 0; 
       while (e != null)
       {
           contatore = contatore + 1;
           e = e.next;
       }
       return contatore;
    }
    
    public void stampaLista()
    {
       Elem e = t;
       while (e!=null)
       {
          System.out.print(e.inf);
          e = e.next;
          if (e!=null)
             System.out.print("->"); 
       }
       System.out.println("|");
    }
    
    public void stampaSottoLista(Elem e)
    {
        if (e==null)
            return;
        System.out.print(e.inf+"->");
        stampaSottoLista(e.next);
    }
    
    public void stampaRic()
    {
        stampaSottoLista(t);
    }
}

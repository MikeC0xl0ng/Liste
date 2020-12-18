package liste;

public class Coda extends Lista
{
    public void aggiungi(int info)
    {
        inserisciInCoda(info);
    }
    
    public void rimuovi()
    {
        if (t==null)
            System.out.println("Coda vuota");
        else
        {
            System.out.println("Ho rimosso:"+t.inf);
            t = t.next;
        }
    }
    
    public void stampaCoda(){
        stampaLista();
    }
}

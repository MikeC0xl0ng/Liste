package liste;

public class ListaBidirezionale {
    ElemBidir t;
    
    public ListaBidirezionale(){
        t = null;
    }
    
    public void inserisciInTesta(int info){
        t = new ElemBidir(info,null,t);
        if (t.next!=null)
           t.next.prev = t; 
    }
    
    public void stampaLista(){
        ElemBidir e = t;
        while (e!=null)
        {
            System.out.print(e.inf+"->");
            e = e.next;
        }
        System.out.print("|");
    }
}

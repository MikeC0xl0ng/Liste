package liste;

public class AlberoB {
    ElemB root;
    
    public AlberoB(){
        root = null;
    }
    
    public ElemB inserisciR(int info, ElemB r)
    {
        if (r==null)
            return new ElemB(info,null,null);
        if (info<r.inf)
            r.sx = inserisciR(info,r.sx);
        else
            r.dx = inserisciR(info,r.dx);
        return r;
    }
    
    public void stampaR(ElemB r)
    {
        if (r==null)
            return;
        stampaR(r.sx);
        System.out.print(" "+r.inf);
        stampaR(r.dx);
    }
    
    public void stampa(){
        stampaR(root);
    }
    public void inserisci(int info){
        root = inserisciR(info,root);
    }
    
    public boolean cercaR(int cosa, ElemB r){
        if (r==null)
            return false;
        if (r.inf==cosa)
            return true;
        if (cosa<r.inf)
            return cercaR(cosa,r.sx);
        return cercaR(cosa,r.dx);
        
    }
    
    public boolean cerca(int cosa)
    {
       return cercaR(cosa,root);
    }
}

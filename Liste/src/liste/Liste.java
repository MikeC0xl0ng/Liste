
package liste;



public class Liste {

    public static void main(String[] args) {
        /*
        Lista l = new Lista();
        l.inserisciInTesta(100);
        l.inserisciInTesta(50);
        l.inserisciInTesta(10);
        l.inserisciInCoda(200);
        l.inserisciInCoda(1);
        l.stampaLista();
        l.stampaRic();
        System.out.println("\n\n");
        System.out.println("Numero di elmenti:"+l.lunghezza());
        */
        
        /*
        Coda c = new Coda();
        c.aggiungi(3);
        c.aggiungi(9);
        c.aggiungi(12);
        c.aggiungi(20);
        System.out.println("In coda ho:"+c.lunghezza());
        c.stampaCoda();
        c.rimuovi();
        c.rimuovi();
        c.stampaCoda();
        */
        
        /*
        ListaBidirezionale lb = new ListaBidirezionale();
        lb.inserisciInTesta(100);
        lb.inserisciInTesta(50);
        lb.inserisciInTesta(20);
        lb.stampaLista();
        */
        
        AlberoB a = new AlberoB();
        a.inserisci(30);
        a.inserisci(9);
        a.inserisci(21);
        a.inserisci(5);
        a.inserisci(45);
        a.inserisci(37);
        a.inserisci(80);
        a.stampa();
        System.out.println("\nCerco 9 e trovo:");
        System.out.println(a.cerca(9));
    }
    
}

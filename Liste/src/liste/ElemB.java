package liste;

public class ElemB {
    int inf;
    ElemB sx;
    ElemB dx;
    
    public ElemB(){
        inf = 0;
        sx = null;
        dx = null;
    }
    
    public ElemB(int info, ElemB s, ElemB d){
        inf = info;
        sx = s;
        dx = d;
    }
    
}

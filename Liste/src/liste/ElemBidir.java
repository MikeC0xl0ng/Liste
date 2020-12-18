package liste;

public class ElemBidir {
    int inf;
    ElemBidir prev;
    ElemBidir next;
    
    public ElemBidir(){
        inf = 0;
        prev = null;
        next = null;
    }
    
    public ElemBidir(int info, ElemBidir p, ElemBidir n){
        inf = info;
        prev = p;
        next = n;
    }
}

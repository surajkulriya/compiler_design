package syntaxtree;

import java.util.*;

public class node {

    Vector<node> successor=new Vector<node>();
    Vector<node> predessor=new Vector<node>();
    Set<String> constants=new HashSet<String>();

    public void putsucc(node n){
        successor.add(n);
    }

    public void putpred(node n){
        predessor.add(n);
    }

    public void setcons(Set<String> v){
        constants=v;
    }

    public Vector<node> getsucc(){
        return successor;
    }

    public Vector<node> getpred(){
        return predessor;
    }

    public Set<String> getcons(){
        return constants;
    }

    public void clear(){
        successor.clear();
        predessor.clear();
        constants.clear();
    }
}

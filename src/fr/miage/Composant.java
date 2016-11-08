package fr.miage;

import java.util.ArrayList;

/**
 * Created by fodoucou on 08/11/2016.
 */
public abstract class Composant <T>{
    ArrayList <T> composite;
    String sujet;

    public Composant(){
            this.sujet=null;
    }

    public void add(T t){
            composite.add(t);
    }

    public void remove(T t){
        composite.remove(t);
    }

    public void size(){
        composite.size();
    }
}

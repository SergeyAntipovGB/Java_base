package home_tasks.lesson6;

import java.util.HashSet;
import java.util.Set;

public class Hometask {
    public static void main(String[] args) {
        
        Set<Notebook> set = new HashSet<>();
        makeSet(set);
        System.out.println(set);

    }

    static void makeSet(Set<Notebook> set){
        Notebook notebook1 = new Notebook(2,250,"linux","white");
        Notebook notebook2 = new Notebook(3,500,"linux","black");
        Notebook notebook3 = new Notebook(4,750,"windows","silver");
        Notebook notebook4 = new Notebook(8,800,"windows","black");
        Notebook notebook5 = new Notebook(6,500,"linux","silver");
        Notebook notebook6 = new Notebook(12,1200,"mac-os","pink");
        Notebook notebook7 = new Notebook(10,2000,"mac-os","silver");
        set.add(notebook1);
        set.add(notebook2);
        set.add(notebook3);
        set.add(notebook4);
        set.add(notebook5);
        set.add(notebook6);
        set.add(notebook7);
    }
}

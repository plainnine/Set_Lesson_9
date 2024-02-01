import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Fish> fishes = new HashSet<Fish>();
        fishes.add(new Fish("eel",1.5,120));
        fishes.add(new Fish("salmon",1.5,120));
        fishes.add(new Fish("carp",1.5,120));
        fishes.add(new Fish("trout",1.5,120));

        System.out.println("Collection: "+fishes);
        System.out.println("Collection's size: "+fishes.size());

        SortedSet<String>animalSet=new TreeSet<>();
        animalSet.add("Antilopa");
        animalSet.add("Fox");
        animalSet.add("Eagle");
        animalSet.add("Hedgehog");
        animalSet.add("Bear");
        animalSet.add("Cat");
        animalSet.add("Hippo");
        animalSet.add("Dog");
        animalSet.add("Galago");

        Iterator iterator= animalSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }
        System.out.println(animalSet.subSet("Dog","Hippo"));
        System.out.println(animalSet.tailSet("Dog"));
        System.out.println(animalSet.headSet("Dog"));
        System.out.println(animalSet.first());
        System.out.println(animalSet.last());
    }
}

class Fish {
private String name;
private double weight;
private double price;


    public Fish(String name, double weight, int price) {
    }
}

@Override
public String toString() {
return this.name+" weight:"+this.weight+" price:"+this.price;
}
@Override
public boolean equals(Object obj) {
    if(obj==this){
        return true;
    }
    if(!(obj instanceof  Fish)){
        return false;
    }
    Fish tmp=(Fish) obj;
    return  (tmp.name.equals(this.name)&&tmp.weight&&tmp.price==this.price);
}
public int hashCode(){
    int code=17;
    code=31*code+this.name.hashCode();
    code=31*code+this.name.weight;
    code=31*code+this.name.price;
    return code;
}
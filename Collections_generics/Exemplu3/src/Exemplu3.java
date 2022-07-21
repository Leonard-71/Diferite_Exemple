
import java.util.*;

public class Exemplu3 {
    public static void main(String[] args){
        ArrayList<Object> al = new ArrayList<Object>();
        al.add("abc");
        al.add('b');
        al.add('a');
        al.add("abc");
        al.add(10.3);
        al.add('c');
        al.add(10);
        System.out.println("Before Duplicate Remove:"+al);
        for(int i=0;i<al.size();i++){
            for(int j=i+1;j<al.size();j++){
                if(al.get(i).equals(al.get(j))){
                    al.remove(j);
                    j--;
                }
            }
        }
        System.out.println("After Removing duplicate:"+al);
    }
}


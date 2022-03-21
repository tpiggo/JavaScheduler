package scheduler;

import java.lang.reflect.Field;

public class Entry {
    String aString;
    int anInt;

    public static void main(String [] args){
        for (Field f: Entry.class.getDeclaredFields()){
            if (String.class == f.getType()) {
                System.out.print("Found string type!");
            } else if (int.class == f.getType()){
                System.out.print("Found int type!");
            }
        }
    }
}

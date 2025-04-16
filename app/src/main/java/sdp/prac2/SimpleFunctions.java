package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    //Task 5 Taryn

    public <T extends Comparable<T>> boolean Task5(List<T> inLst){
        for(int i = 0; i < inLst.size()-1; i++){
            if(inLst.get(i).compareTo(inLst.get(i+1))>0){
                return false;
            }
        }
        return true;
    }
}

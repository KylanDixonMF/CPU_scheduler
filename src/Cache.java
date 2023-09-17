import java.util.*;
public class Cache <T> {
    private LinkedList<T> cache_1;
    private int maxCache_1;
    T found;
    int size;
    int hits_1;
    int accesses_1;
    //create new linked list for cache and set capacity
    public Cache(int Capacity){
        maxCache_1 = Capacity;
        cache_1 = new LinkedList<>();
    }
    //Find the index of data
    public T find(T data){
        if(cache_1.indexOf(data) < 0){
            return null;
        }
        else{
            return cache_1.get(cache_1.indexOf(data));
        }
    }
    //get the size of the cache
    public int getSize(){
            return cache_1.size();
    }
    //move/remove data and add to front
    public void move(T data){
        if(cache_1.contains(data)){
        cache_1.remove(data);
        cache_1.addFirst(data);
        }
    }
    //add a new object and fix size by removing last in cache
    public void addObject(T data){
        if(cache_1.size() == maxCache_1){
            cache_1.removeLast();
        }
        cache_1.addFirst(data);
    

        // if(cache_2 == null){
        //     accesses_1++;
        //     if(cache_1.contains(data)) {
        //         hits_1++;
        //         cache_1.remove(data);
        //         cache_1.addFirst(data);
        //     }
        //     else{
        //         if(cache_1.size() >= getSize()){
        //             cache_1.removeLast();
        //         }
        //             cache_1.addFirst(data);
        //     }

        // }
        // else{
        //     accesses_1++;
        //     if(cache_1.contains(data)){
        //         hits_1++;

        //         cache_1.remove(data);
        //         cache_2.remove(data);

        //         cache_1.addFirst(data);
        //         cache_2.addFirst(data);
        //     }
        //     else{
        //         accesses_2++;
        //         if(cache_2.contains(data)){
        //             hits_2++;
        //             cache_2.remove(data);
        //             cache_1.addFirst(data);
        //             cache_2.addFirst(data);
        //         }
        //         else{
        //             if(cache_1.size() >= maxCache_1){
        //                 cache_1.removeLast();
        //             }
        //             if(cache_2.size() >= maxCache_2){
        //                 cache_2.removeLast();
        //             }
        //             cache_1.addFirst(data);
        //             cache_2.addFirst(data);
        //         }
        //     }
        // }
    }
    public void incrementHits(){
        hits_1++;
    }
    public void incrementAccesses(){
        accesses_1++;
    }
    public int getHits(){
        return hits_1;
    }
    public int getAccesses(){
        return accesses_1;
    }

    // public String toString(long l){
    //     String string = "";
    //     string +=
    //     "****************************************************************\n";
    //     string += "Level 1 cache has a capacity of " + Capacity +"\n";
    //     string += "Level 2 cache has a capacity of " + Capacity_2 + "\n";
    //     string += "Level 1 cache accesses: " + accesses_1 + "\n";
    //     string += "Level 2 cache accesses: " + accesses_2 + "\n";
    //     string += "Total accesses: " + (accesses_1) + "\n";
    //     string += "Hits on level 1 Cache: " + hits_1 + "\n";
    //     string += "Hits on level 2 Cache: " + hits_2 + "\n";
    //     string += "Total Hits: " + (hits_1 + hits_2) + "\n";
    //     string += "Hit ratio Level 1: " + hits_1/accesses_1 + "\n";
    //     string += "Hit ratio Level 2: " + hits_2/accesses_2 + "\n";
    //     string += "Total hit ratio: " + ((hits_1 + hits_2)/(accesses_1) + "\n";
    // }







}

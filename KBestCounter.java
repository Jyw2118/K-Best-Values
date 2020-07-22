//Joanne Wang

import java.util.*;

public class KBestCounter<T extends Comparable<? super T>> implements KBest<T>
{
    private PriorityQueue<T> heap;
    int k;
    
    public KBestCounter(int k){
        this.k=k;
        heap= new PriorityQueue<T>(k);
        
    }
    
	public void count(T x){
        if (heap.size()<k&&heap.size()>=0)
        {
            heap.add(x);
        }
        else
        {
            if(heap.peek().compareTo(x)<0)
            {
                heap.poll();
                heap.add(x);
            }
        }
    
    }
    
	public List<T> kbest(){
        int size= heap.size();
        ArrayList<T> best= new ArrayList<T>();
        
        for (int i=0; i<size;i++){
            best.add(heap.poll());
        }
        
        for (int i=0; i<size; i++){
            heap.add(best.get(i));
        }
        
        return best;
    }
}

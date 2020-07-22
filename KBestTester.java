//Joanne Wang

public class KBestTester{
    @SuppressWarnings("unchecked")
    public static void main (String[] args){
        int k=5;
        KBestCounter test= new KBestCounter(k);
        
        //test.count(5);
        //test.count(6);
        test.count(2);
        test.count(1);
        test.count(27);
        test.count(100);
        
        for (Object best: test.kbest()){
            System.out.println(best);
        }
        
    }
}
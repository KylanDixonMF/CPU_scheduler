import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
import java.io.FileNotFoundException;

public class test {
    public static void main(String args[]) {

        Cache<String> TestCache = null;
        Cache<String> TestCache2 = null;
        int numCache = Integer.parseInt(args[1]);
        //check if args are valid for 1 level or 2 level cache and create new caches
        if(args[0].equals("2") ){
            int numCache2 = Integer.parseInt(args[2]);
            TestCache = new Cache<>(numCache);
            TestCache2 = new Cache<>(numCache2);
        }
        else if(args[0].equals("1")){
            TestCache = new Cache<>(numCache);
        }
        //exit program 
        else{
            System.exit(1);
        }

        String file = args[Integer.parseInt(args[0]) + 1];
        Scanner scanner = null;
        //scan and parse lines/words if word == found increment hits and move "found"
        //if != found increment accesses
        try{
        scanner = new Scanner(new File(file));
        }

        catch(FileNotFoundException e){
            System.out.println();
            System.exit(1);
        }
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(line, "\t ");
            while(st.hasMoreTokens()){
                String word = st.nextToken();
                if(TestCache2 == null){
                    TestCache.incrementAccesses();
                    String found = TestCache.find(word);
                    if(found != null){
                        TestCache.incrementHits();
                        TestCache.move(found);
                    }
                    else{
                        TestCache.addObject(word);
                    }
                }
                else{
                    String found = TestCache.find(word);
                    TestCache.incrementAccesses();
                    if(found != null){
                        TestCache.incrementHits();
                        TestCache.move(found);
                        TestCache2.move(found);
                    }
                    else{
                        TestCache2.incrementAccesses();
                        found = TestCache2.find(word);
                        if(found != null){
                            TestCache2.incrementHits();
                            TestCache2.move(found);
                            TestCache.addObject(found);
                        }
                        else{
                            TestCache.addObject(word);
                            TestCache2.addObject(word);
                        }
                    }




                }


            }
          
        }
        //print out results
        System.out.println("Cache 1 Accesses: " + TestCache.getAccesses());
        System.out.println("Cache 1 Hits: " + TestCache.getHits());
        System.out.println("Cache 1 Hit Ratio: " + (double)TestCache.getHits() / (double)TestCache.getAccesses());
        if (TestCache2 != null) {
        System.out.println("Cache 2 Accesses: " + TestCache2.getAccesses());
        System.out.println("Cache 2 Hits: " + TestCache2.getHits());
        System.out.println("Total Cache Hits: " + TestCache.getHits());
        System.out.println("Cache 2 Hit Ratio: " + (double)TestCache2.getHits()/ (double)TestCache2.getAccesses());
        System.out.println("Total Cache Hit ratio: " + (double)(TestCache2.getHits() + (double) TestCache.getHits())/ (double)TestCache.getAccesses());
        }

    }
}
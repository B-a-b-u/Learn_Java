// Graphs

/*
 * Non linear datastructure
 * types:
 *      Directed
 *      Undirected
 *      Weighted
 *      Unweighted
 *      Cyclic can be directed or undirected
 *      Acyclic
 * 
 * To create a graph we need   ADJACENCY LIST (like adjacency matrix)
 *  It is like dictionary
 * 
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;


public class MyGraph {

    static boolean isAquanted(HashMap<String,String[]> adjacencyList, String name1, String name2){
        String[] friends = adjacencyList.get(name1);
        HashSet<String> visited  = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(name1);
        visited.add(name1);
        while (!queue.isEmpty()) {
            String current = queue.poll();
            if (current.equals(name2)) {
                return true;
            }
            for (String friend : adjacencyList.get(current)) {
                if (!visited.contains(friend)) {
                    queue.offer(friend);
                    visited.add(friend);
                }   
            }
        }

        return false;
    }

    public static void main(String[] args) {
        HashMap<String, String[]> adjacencyList = new HashMap<>();
        adjacencyList.put("Ravi", new String[]{"Tanya","John","Soniya"});
        adjacencyList.put("Tanya", new String[]{"Ravi"});
        adjacencyList.put("Jonh", new String[]{"Ravi"});
        adjacencyList.put("Soniya", new String[]{"Ravi","Yasha"});
        adjacencyList.put("Yasha", new String[]{"Soniya"});

        
        System.out.println(isAquanted(adjacencyList, "Ravi", "Soniya"));


    }
}
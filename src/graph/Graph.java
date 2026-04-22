//file name: Graph.java
import java.util.HashMap;
import java.util.Map;


// for custom adjacency list FriendList, BFS, shortest path
// stores the connections, this is the actual graph

public class Graph {

    //creating a hashmap with the custom DS FriendList
    private Map<String, FriendList> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    // all the methods we need to implement
    public void addUser(String username) {}

    public void addFriendship(String u1, String u2) {}

    public void removeUser(String username) {}

    public void displayFriends(String username) {}

    public void suggestFriends(String username) {}

    public void shortestPath(String u1, String u2) {}

    public void mutualFriends(String u1, String u2) {}
}

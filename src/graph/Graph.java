//file name: Graph.java
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;


// for custom adjacency list FriendList, BFS, shortest path
// stores the connections, this is the actual graph

public class Graph {

    //creating a hashmap with the custom DS FriendList
    private Map<String, FriendList> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    // ADD USER
        public void addUser(String username) {
            if (adjacencyList.containsKey(username)) {
            System.out.println(username + " already exists.");
            return;
         }

            // otherwise add them with an empty FriendList
            adjacencyList.put(username, new FriendList());
            System.out.println(username + " added to the network.");
    }

    // ADD FRIENDSHIP
    public void addFriendship(String u1, String u2) {
            // check if both users exist
            if (!adjacencyList.containsKey(u1) || !adjacencyList.containsKey(u2)) {
                System.out.println("One or both users do not exist.");
                return;
            }

            // get their friend lists
            FriendList list1 = adjacencyList.get(u1);
            FriendList list2 = adjacencyList.get(u2);

            // avoid duplicates
            if (list1.contains(u2)) {
                System.out.println("They are already friends.");
                return;
            }

            // add each other
            list1.add(u2);
            list2.add(u1);

            System.out.println(u1 + " and " + u2 + " are now friends.");
    }
    
    // REMOVE USER
    public void removeUser(String username) {
        // check if  user exists
            if (!adjacencyList.containsKey(username)) {
                System.out.println("User does not exist.");
                return;
            }

        // remove user from all useres' friend lists
        for (String user : adjacencyList.keySet()) {
        FriendList list = adjacencyList.get(user);
        list.remove(username);
        }

        adjacencyList.remove(username);

    System.out.println(username + " has been removed from the network.");
    }


    // DISPLAY FRIENDS
    public void displayFriends(String username) {
        // check if  user exists
            if (!adjacencyList.containsKey(username)) {
                System.out.println("User does not exist.");
                return;
            }
        System.out.println("Friends of " + username + ": ");
        adjacencyList.get(username).printAll();
    }






    // SUGGEST FRIENDS (BFS)
    public void suggestFriends(String username) {
        if (!adjacencyList.containsKey(username)) {
            System.out.println("User does not exist.");
            return;
        }

    // BFS setup
    Queue<String> queue = new LinkedList<>();
    Set<String> visited = new HashSet<>();

    queue.add(username);
    visited.add(username);

    // direct friends (to exclude)
    FriendList directFriends = adjacencyList.get(username);

    Set<String> suggestions = new HashSet<>();

    int level = 0;

    while (!queue.isEmpty() && level < 2) {
        int size = queue.size();

        for (int i = 0; i < size; i++) {
            String current = queue.poll();

            FriendList friends = adjacencyList.get(current);
            FriendNode node = friends.getHead();

            while (node != null) {
                String friend = node.name;

                if (!visited.contains(friend)) {
                    queue.add(friend);
                    visited.add(friend);

                    // distance 2 = suggestion
                    if (level == 1 &&
                        !directFriends.contains(friend) &&
                        !friend.equals(username)) {
                        suggestions.add(friend);
                    }
                }

                node = node.next;
            }
        }

        level++;
    }

    // print results
    if (suggestions.isEmpty()) {
        System.out.println("No friend suggestions for " + username + ".");
    } else {
        System.out.println("Friend suggestions for " + username + ":");
        for (String s : suggestions) {
            System.out.println("- " + s);
        }
    }
}

    // SHORTEST PATH 
    public void shortestPath(String u1, String u2) {



    }

    // MUTUAL FRIENDS
    public void mutualFriends(String u1, String u2) {
         // check if both users exist
            if (!adjacencyList.containsKey(u1) || !adjacencyList.containsKey(u2)) {
                System.out.println("One or both users do not exist.");
                return;
            }
        FriendList list1 = adjacencyList.get(u1);
        FriendList list2 = adjacencyList.get(u2);

        System.out.println("Mutual friends of " + u1 + " and " + u2 + ":");
        FriendNode current = list1.getHead();
        boolean foundAny = false;

        while (current != null) {
            if (list2.contains(current.name)) {
                System.out.println("- " + current.name);
                foundAny = true;
            }
            current = current.next;
        }

        if (!foundAny) {
            System.out.println("None.");
            }
        }

    
}



// file name: FriendList.java
// custom linked list 

public class FriendList {
    private FriendNode head;

    public FriendList() {
        this.head = null;
    }

    // methods to implement
    public void add(String friendName) {

        FriendNode newNode = new FriendNode(friendName);

        // if the list is empty then the new node is the head now
        if (head == null) {
            head = newNode;
            return;
        }
        // walk to the end of the list if the list is not empty
        FriendNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        //attach a new node
        current.next = newNode;
    }

    public void remove(String friendName) {
         // if the list is empty then return
        if (head == null) {
            return;
        }

        // if head is the one to remove
        if (head.name.equals(friendName)) {
            head = head.next;
            return;
        }
       
       // otherwise find the node BEFORE the one to remove
        FriendNode current = head;

        while (current.next != null && !current.next.name.equals(friendName)) {
            current = current.next;
        }

        // if we found the node skip it
        if (current.next != null) {
            current.next = current.next.next;
        }




    }

    public boolean contains(String friendName) {
         // if the list is empty then return
        if (head == null) {
            return false;
        }

        //otherwise see if friendName is there by walking 
        // through the list
        FriendNode current = head;
        while (current != null) {
            if (current.name.equals(friendName)) {
                return true;
            }
            current = current.next;
        }
           // if it's not there
            return false;
        }
    

    public void printAll() {
         // if list is empty
            if (head == null) {
                System.out.println("No friends found.");
                return;
            }

            // walk through the list printing
            FriendNode current = head;
            while (current != null) {
                System.out.println("- " + current.name);
                current = current.next;
            }
        }    

}


# Repository Name: socialmedia-data-structures
# Repository Link: https://github.com/nandii-p/socialmedia-data-structures 
# Team Members: Saniya Alexander, Michael Oloye, Nandi Pitts, Taylor Stockdale

# Project Descirption: 
# Simplified social network built entirely from scratch using custom data structures.
# Each user is represented as a node, and each friendship is an undirected edge.
# Used knowledge from class on adjacency lists to add/remove friendships (edges), add users (nodes), etc
# The basic java ArrayList & HashMap were not used, we created FriendList and FriendNode for our structure


# How to Compile & Run
# 1. Navigate to the src folder
# cd src
# 2. Compile all Java files (UTF‑8 required for ASCII art)
# javac -encoding UTF-8 *.java
# 3. Run the program
# java App
# You should see the ASCII menu appear, and you can interact with the network using the numbered options.


# Data Structure Justification
# We chose a custom adjacency list to represent the social network because:

# It stores only existing friendships, not all possible ones.
# It scales efficiently for sparse graphs (which real social networks are).
# Adding users and friendships is O(1) on average.
# It avoids the memory waste of an adjacency matrix, which would require
# n × n space even when most users are not connected.
#
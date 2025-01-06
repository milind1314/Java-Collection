Que 2 : Saving and Restoring Favorite Fruits Using Serialization
================================================================

-> You are tasked with developing a feature in a Java application that allows users to save and restore their collection of favorite fruits. 
   This feature will involve serializing a HashSet of fruits to a file and then deserializing it to verify that the data has been correctly saved and loaded.


Create Class: HashSetSerialization
----------------------------------

Method: 
-> public static void serializeHashSet(HashSet<String> set, String filename) 
-> public static HashSet<String> deserializeHashSet(String filename)
-> main method

-> In main methods
-> Create a HashSet and add some String elements
-> Specify a file to store the serialized HashSet like,
   String filename = "hashset.ser";
-> Serialize the HashSet by calling serializeHashSet(hashsetobj, filename)s
-> Deserialize the HashSet by calling deserializeHashSet(String filename)
-> Make sure serializeHashSet() method and deserializeHashSet() method will handle possible Exception using try catch.
-> Display the deserialized HashSet as result.

Conditions :
------------
-> if HashSet object is empty then print "The deserialized HashSet is empty"


TEST CASE 1 :
-------------
sample input :  HashSet<String> obj=new HashSet<>();
                if obj.isEmpty()==true then,
sample output : The deserialized HashSet is empty

TEST CASE 1 :
-------------
sample input :  HashSet<String> obj=new HashSet<>();
                obj.add("Apple"); obj.add("Banana"); obj.add("Mango")....so on;
                perform serialization and deseialization and print deserialization object like below
sample output : Deserialized HashSet: [Apple, Banana, Mango]

import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int compareTo(Student s) {
        return this.id - s.id; // sort by id
    }

    public String toString() {
        return id + " " + name + " " + cgpa;
    }
}

public class CollectionsFramework {

    public static void main(String[] args) {

        System.out.println("===== COLLECTIONS FRAMEWORK =====");

        // ARRAYLIST (Dynamic Array)
        System.out.println("ArrayList Example");

        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Java");  // duplicates allowed

        System.out.println("List: " + list);

        // Access element
        System.out.println("Element at index 1: " + list.get(1));

        // Update
        list.set(2, "JavaScript");
        System.out.println("After update: " + list);

        // Remove
        list.remove("Python");
        System.out.println("After remove: " + list);

        // Size
        System.out.println("Size: " + list.size());

        // Contains
        System.out.println("Contains Java? " + list.contains("Java"));

        // Loop
        System.out.println("Loop using for-each:");
        for(String s : list) System.out.println(s);

        // Sort
        Collections.sort(list);
        System.out.println("Sorted: " + list);

        // Convert to array
        String[] arr = list.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(arr));

        // HASHSET (No duplicates)
        System.out.println("HashSet Example");

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // duplicate ignored

        System.out.println("Set: " + set);

        // Remove
        set.remove(20);
        System.out.println("After remove: " + set);

        // Contains
        System.out.println("Contains 30? " + set.contains(30));

        // Loop
        System.out.println("Loop Set:");
        for(int num : set) System.out.println(num);

        // Size
        System.out.println("Size: " + set.size());

        // HASHMAP (Key-Value Pair)
        System.out.println("HashMap Example");

        HashMap<String, Integer> map = new HashMap<>();

        // Put values
        map.put("Alice", 85);
        map.put("Bob", 90);
        map.put("Charlie", 78);

        System.out.println("Map: " + map);

        // Get value
        System.out.println("Alice marks: " + map.get("Alice"));

        // Update value
        map.put("Alice", 95);
        System.out.println("After update: " + map);

        // Remove
        map.remove("Charlie");
        System.out.println("After remove: " + map);

        // Contains key/value
        System.out.println("Contains Bob? " + map.containsKey("Bob"));
        System.out.println("Contains 90? " + map.containsValue(90));

        // Loop using entrySet
        System.out.println("Loop Map:");
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Keys only
        System.out.println("Keys: " + map.keySet());

        // Values only
        System.out.println("Values: " + map.values());

        // Useful Collection Utilities
        System.out.println("Utilities");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5,1,9,3));

        System.out.println("Original: " + nums);

        Collections.sort(nums);
        System.out.println("Sorted: " + nums);

        Collections.reverse(nums);
        System.out.println("Reversed: " + nums);

        System.out.println("Max: " + Collections.max(nums));
        System.out.println("Min: " + Collections.min(nums));
        System.out.println("Frequency of 3: " + Collections.frequency(nums, 3));

        Collections.shuffle(nums);
        System.out.println("Shuffled: " + nums);

        // LINKEDLIST
        System.out.println("LinkedList Example");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.addFirst(5);
        linkedList.addLast(20);
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println("After removeFirst: " + linkedList);


        // HASHSET
        System.out.println("HashSet Example");
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(10); set1.add(20); set1.add(30); set1.add(10);
        System.out.println("Set: " + set1);

        // LINKEDHASHSET
        System.out.println("LinkedHashSet Example");
        Set<String> lhs = new LinkedHashSet<>();
        lhs.add("A"); lhs.add("B"); lhs.add("A");
        System.out.println(lhs);

        // TREESET
        System.out.println("TreeSet Example");
        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(9,2,7,1));
        System.out.println(treeSet);

        // LINKEDHASHMAP
        System.out.println("LinkedHashMap Example");
        Map<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("X",1); lhm.put("Y",2);
        System.out.println(lhm);

        // TREEMAP
        System.out.println("TreeMap Example");
        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("Zara",70);
        treeMap.put("Anna",92);
        System.out.println(treeMap);

        System.out.println("Loop Map:");
        for(Map.Entry<String,Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());


        // ITERATOR
        System.out.println("Iterator Example");
        Iterator<String> it = list.iterator();
        while(it.hasNext()) System.out.println(it.next());


        // STACK
        System.out.println("Stack Example");
        Stack<String> stack = new Stack<>();
        stack.push("A"); stack.push("B");
        System.out.println("Pop: " + stack.pop());


        // QUEUE & PRIORITYQUEUE
        System.out.println("Queue Example");
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1); queue.add(2);
        System.out.println("Poll: " + queue.poll());

        System.out.println("PriorityQueue Example");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(50); pq.add(10); pq.add(30);
        System.out.println("Smallest: " + pq.poll());


        // CUSTOM OBJECT COLLECTION
        System.out.println("Custom Object Sorting");
        List<Student> students = new ArrayList<>();
        students.add(new Student(3,"Rahim",3.5));
        students.add(new Student(1,"Karim",3.9));
        students.add(new Student(2,"Hasan",3.2));

        Collections.sort(students);
        System.out.println("Sorted by ID: " + students);

        students.sort((a,b) -> Double.compare(b.cgpa, a.cgpa));
        System.out.println("Sorted by CGPA: " + students);

        System.out.println("End of Collections Framework");
    }
}
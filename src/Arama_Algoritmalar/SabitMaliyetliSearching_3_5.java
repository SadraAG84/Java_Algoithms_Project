package Arama_Algoritmalar;

import java.util.*;

class Node {
    int value;
    int cost;

    public Node(int value, int cost) {
        this.value = value;
        this.cost = cost;
    }
}

public class SabitMaliyetliSearching_3_5 {
    public static void main() {
        // Örnek grafı oluşturun
        Map<Integer, List<Node>> graph = new HashMap<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the dimension of array: ");
        int dimension = input.nextInt();
        int[] array = new int[dimension];
        System.out.println("Please enter the array elements: ");
        for (int i = 0; i < dimension; i++) {
            System.out.println("Please enter the " + (i + 1) + ". number: ");
            array[i] = input.nextInt();
        }




        graph.put(1, Arrays.asList(new Node(2, 3), new Node(3, 5)));
//        graph.put(2, Arrays.asList(new Node(4, 2), new Node(5, 4)));
//        graph.put(3, Arrays.asList(new Node(5, 1)));
//        graph.put(4, Arrays.asList(new Node(6, 6)));
//        graph.put(5, Arrays.asList(new Node(6, 3)));

        int startNode = 1;
        int targetNode = 6;

        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(node -> node.cost));
        queue.add(new Node(startNode, 0));

        Map<Integer, Integer> parentMap = new HashMap<>();
        Map<Integer, Integer> costMap = new HashMap<>();
        costMap.put(startNode, 0);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            int current = currentNode.value;
            int currentCost = currentNode.cost;

            if (current == targetNode) {
                break;
            }

            for (Node neighbor : graph.getOrDefault(current, Collections.emptyList())) {
                int neighborNode = neighbor.value;
                int neighborCost = neighbor.cost;

                int totalCost = currentCost + neighborCost;
                if (!costMap.containsKey(neighborNode) || totalCost < costMap.get(neighborNode)) {
                    costMap.put(neighborNode, totalCost);
                    parentMap.put(neighborNode, current);
                    queue.add(new Node(neighborNode, totalCost));
                }
            }
        }

        // Yolu geriye doğru takip ederek sonucu bulun
        List<Integer> path = new ArrayList<>();
        int currentNode = targetNode;
        while (currentNode != startNode) {
            path.add(currentNode);
            currentNode = parentMap.get(currentNode);
        }
        path.add(startNode);
        Collections.reverse(path);

        System.out.println("En kısa yol: " + path);
        System.out.println("Toplam maliyet: " + costMap.get(targetNode));
    }
}


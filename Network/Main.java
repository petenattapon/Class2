import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;

class Node {
    private int cityCode;
    private List<Node> links;
    private String ipAddress; // เพิ่มตัวแปรเก็บ IP address

    public Node(int cityCode) {
        this.cityCode = cityCode;
        this.links = new ArrayList<>();
        this.ipAddress = getIPAddress(); // กำหนดค่า IP address เมื่อสร้าง Node
    }

    public int getCityCode() {
        return cityCode;
    }

    public List<Node> getLinks() {
        return links;
    }

    public void addLink(Node node) {
        links.add(node);
    }

    public String getIPAddress() {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return "";
        }
    }

    public String getFormattedIPAddress() {
        return ipAddress.replace("/", "");
    }
}

class TSPSolver {
    public String[] solveTSP(Node startNode) {
        Queue<Node> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(startNode);

        // ประกาศอาร์เรย์สำหรับเก็บผลลัพธ์ของแต่ละ Node
        String[] results = new String[4];

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            int cityCode = currentNode.getCityCode();

            if (!visited.contains(Integer.toString(cityCode))) {
                String result = "City " + cityCode + " sends " + cityCode + " to all cities: ";
                for (Node nextNode : currentNode.getLinks()) {
                    result += nextNode.getCityCode() + ", ";

                    String nextCityCode = Integer.toString(nextNode.getCityCode());
                    String combinedCode = Integer.toString(cityCode) + nextCityCode;

                    if (!visited.contains(combinedCode)) {
                        visited.add(combinedCode);
                        queue.add(nextNode);
                    }
                }

                // เก็บผลลัพธ์ในอาร์เรย์ตามตำแหน่งของ cityCode - 1 (เนื่องจากเริ่มต้นที่ 1)
                results[cityCode - 1] = result;
            }
        }

        return results;
    }
}

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.addLink(node2);
        node1.addLink(node3);
        node1.addLink(node4);

        node2.addLink(node1);
        node2.addLink(node3);
        node2.addLink(node4);

        node3.addLink(node1);
        node3.addLink(node2);
        node3.addLink(node4);

        node4.addLink(node1);
        node4.addLink(node2);
        node4.addLink(node3);

        TSPSolver tspSolver = new TSPSolver();
        String[] results = tspSolver.solveTSP(node1);

        // แสดงผลลัพธ์ของแต่ละโหนด
        for (int i = 0; i < results.length; i++) {
            System.out.println("Result for Node " + (i + 1) + ":");
            System.out.println(results[i]);
        }
    }
}




// import java.net.InetAddress;
// import java.net.UnknownHostException;
// import java.util.*;

// class Node {
//     private int cityCode;
//     private List<Node> links;
//     private String ipAddress; // เพิ่มตัวแปรเก็บ IP address

//     public Node(int cityCode) {
//         this.cityCode = cityCode;
//         this.links = new ArrayList<>();
//         this.ipAddress = getIPAddress(); // กำหนดค่า IP address เมื่อสร้าง Node
//     }

//     public int getCityCode() {
//         return cityCode;
//     }

//     public List<Node> getLinks() {
//         return links;
//     }

//     public void addLink(Node node) {
//         links.add(node);
//     }

//     public String getIPAddress() {
//         try {
//             return InetAddress.getLocalHost().getHostAddress();
//         } catch (UnknownHostException e) {
//             e.printStackTrace();
//             return "";
//         }
//     }

//     public String getFormattedIPAddress() {
//         return ipAddress.replace("/", "");
//     }
// }

// class TSPSolver {
//     public String[] solveTSP(Node startNode) {
//         Queue<Node> queue = new LinkedList<>();
//         Set<String> visited = new HashSet<>();

//         queue.add(startNode);

//         String[] results = new String[4];

//         while (!queue.isEmpty()) {
//             Node currentNode = queue.poll();
//             int cityCode = currentNode.getCityCode();

//             if (!visited.contains(Integer.toString(cityCode))) {
//                 StringBuilder result = new StringBuilder();
//                 result.append("City ")
//                         .append(cityCode)
//                         .append(" (IP: ")
//                         .append(currentNode.getFormattedIPAddress())
//                         .append(") send ")
//                         .append(cityCode)
//                         .append(" to all Cities");

//                 for (Node nextNode : currentNode.getLinks()) {
//                     String nextCityCode = Integer.toString(nextNode.getCityCode());
//                     String combinedCode = Integer.toString(cityCode) + nextCityCode;

//                     if (!visited.contains(combinedCode)) {
//                         result.append("\nCity ")
//                                 .append(nextCityCode)
//                                 .append(" (IP: ")
//                                 .append(nextNode.getFormattedIPAddress())
//                                 .append(") received and added ")
//                                 .append(nextCityCode)
//                                 .append(" to become ")
//                                 .append(combinedCode);
//                         visited.add(combinedCode);
//                         queue.add(nextNode);
//                     }
//                 }

//                 results[cityCode - 1] = result.toString();
//             }
//         }

//         return results;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Node node1 = new Node(1);
//         Node node2 = new Node(2);
//         Node node3 = new Node(3);
//         Node node4 = new Node(4);

//         node1.addLink(node2);
//         node1.addLink(node3);
//         node1.addLink(node4);

//         node2.addLink(node1);
//         node2.addLink(node3);
//         node2.addLink(node4);

//         node3.addLink(node1);
//         node3.addLink(node2);
//         node3.addLink(node4);

//         node4.addLink(node1);
//         node4.addLink(node2);
//         node4.addLink(node3);

//         TSPSolver tspSolver = new TSPSolver();
//         String[] results = tspSolver.solveTSP(node1);

//         // Print the results for each node
//         for (int i = 0; i < results.length; i++) {
//             System.out.println("Result for Node " + (i + 1) + ":\n" + results[i]);
//         }
//     }
// }


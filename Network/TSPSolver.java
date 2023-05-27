// import java.util.*;

// class TSPSolver {
//     public void solveTSP(Node startNode) {
//         Queue<List<Node>> queue = new LinkedList<>();
//         List<Node> initialPath = new ArrayList<>();
//         initialPath.add(startNode);
//         queue.add(initialPath);

//         while (!queue.isEmpty()) {
//             List<Node> currentPath = queue.poll();
//             Node currentNode = currentPath.get(currentPath.size() - 1);

//             if (currentPath.size() == 4) { // ��������ͧ��� 4 ���� (�繵�����ҧ���ͧ 4 ���ͧ)
//                 printPath(currentPath); // �������鹷ҧ��辺
//                 continue; // ��Ѻ令�����鹷ҧ��� �
//             }

//             for (Node nextNode : currentNode.getLinks()) {
//                 if (!currentPath.contains(nextNode)) {
//                     List<Node> newPath = new ArrayList<>(currentPath);
//                     newPath.add(nextNode);
//                     queue.add(newPath);
//                 }
//             }
//         }
//     }

//     private void printPath(List<Node> path) {
//         StringBuilder sb = new StringBuilder();
//         for (Node node : path) {
//             sb.append(node.getCityCode()).append(" ");
//         }
//         System.out.println(sb.toString());
//     }
// }

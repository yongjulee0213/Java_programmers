import java.util.LinkedList;
import java.util.Queue;

class Solution {
    int[] dx = {0, 0, -1, +1};
    int[] dy = {-1, +1, 0, 0};
    
    
     // 상대진영에 도달할 수 없으면 -1리턴하라고 했기에

    public void bfs(int x, int y, int[][] maps,int [][]visited) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y));
        visited[x][y] = 1;
    
            while (!queue.isEmpty()) {
                Node node = queue.poll();//최상단 노드 꺼내서 현재 위치로 설정
                int cur_x = node.x;
                int cur_y = node.y;

                for (int i = 0; i < 4; i++) {
                    int next_x = dx[i] + cur_x;//다음 좌표 위치 구하기
                    int next_y = dy[i] + cur_y;

                    if (next_x <0 || next_y < 0 || next_x > maps.length-1 || next_y > maps[0].length-1) continue;//맵을 벗어나면 x
                    if (visited[next_x][next_y]!=0|| maps[next_x][next_y] == 0) continue;//이미 방문했거나 장애물이 있다면 
                    else {
                        visited[next_x][next_y] = 1+visited[cur_x][cur_y];//방문처리
                    queue.offer(new Node(next_x, next_y));//다음위치 큐에 넣   
                         }
                }
            }
    }

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int solution(int[][] maps) {
        int[][] visited = new int[maps.length][maps[0].length];
        bfs(0, 0, maps,visited);
        int result = visited[maps.length-1][maps[0].length-1];
        if (result==0) return -1;
        return result;
    }
}

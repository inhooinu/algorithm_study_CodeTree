import java.util.*;

class Agent {
    char codename;
    int score;

    public Agent(char codename, int score) {
        this.codename=codename;
        this.score=score;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Agent[] agentList = new Agent[5];
        for (int i=0; i<5; i++) {
            char codename = sc.next().charAt(0);
            int score = sc.nextInt();
            agentList[i] = new Agent(codename, score);
        }

        Arrays.sort(agentList, (a, b) -> {
            return a.score-b.score;
        });
        System.out.println(agentList[0].codename + " " + agentList[0].score);
    }
}
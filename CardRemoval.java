import java.util.*;
import java.io.*;

public class CardRemoval {
	static int [][] cards; 
	static int [] cycleLengths, getID; 
	static int currentLength = 0, cycleCount = 0, MOD = (int) (1e9 + 7);
	
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		cards = new int[N + 1][2]; 
		cycleLengths = new int [N + 1]; getID = new int[N + 1];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) cards[i][0] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) cards[i][1] = Integer.parseInt(st.nextToken());
		Arrays.sort(cards, (x, y) -> x[0] == y[0] ? x[1] - y[1] : x[0] - y[0]);

		int ID = 0;
		for (int i = 1; i <= N; i++) 
			if (cycleLengths[i] == 0) { 
				currentLength = 0; cycleCount ++;
				dfs(i, i, ID, false); dfs(i, i, ID, true); ID ++; 
			}

		boolean [] counted = new boolean[cycleCount];
		int [] powersOf2 = new int[cycleCount]; powersOf2[0] = 1;
		for (int i = 1; i < cycleCount; i++) powersOf2[i] = (powersOf2[i - 1] * 2) % MOD;
		
		int Q = Integer.parseInt(br.readLine());
		while (Q --> 0) {
			int r = Integer.parseInt(br.readLine());
			if (!counted[getID[r]]) { counted[getID[r]] = true; cycleCount --; }
			System.out.println(cycleLengths[r] - 1 + " " + powersOf2[cycleCount]);
		}
		
		br.close();
  } 
  public static void dfs(int source, int node, int ID, boolean update) {
		if (update) cycleLengths[node] = currentLength;
		else currentLength ++;
		getID[node] = ID;

		int next = cards[node][1];
		if (source == next) return;
		dfs(source, next, ID, update);
	}
}

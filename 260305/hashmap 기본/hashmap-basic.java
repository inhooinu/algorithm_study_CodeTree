import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static HashMap<Integer, Integer> m;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		m = new HashMap<>();
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String c = st.nextToken();
			if (c.equals("add")) {
				int k = Integer.parseInt(st.nextToken());
				int v = Integer.parseInt(st.nextToken());
				add(k,v);
			} else if (c.equals("find")) {
				int k = Integer.parseInt(st.nextToken());
				find(k);
			} else if (c.equals("remove")) {
				int k = Integer.parseInt(st.nextToken());
				remove(k);
			}
		}
	}

	private static void remove(int k) {
		m.remove(k);
	}

	private static void find(int k) {
		if (m.containsKey(k)) {
			System.out.println(m.get(k));
		} else {
			System.out.println("None");
		}
	}

	private static void add(int k, int v) {
		m.put(k, v);		
	}
}

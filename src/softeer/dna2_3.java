package softeer;

import java.util.*;

public class dna2_3 {

	static int N, M;
    static String[] sequences;
    static int answer;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        sequences = new String[N];
        for (int i = 0; i < N; i++) {
            sequences[i] = sc.next();
        }

        answer = N;
        findSuperSequences(0, new ArrayList<>());

        System.out.println(answer);

        sc.close();
	}
	
	public static void findSuperSequences(int idx, List<String> currentSequences) {
        if (idx == N) {
            int count = 0;
            for (String seq : sequences) {
                boolean covered = false;
                for (String superSeq : currentSequences) {
                    if (matches(superSeq, seq)) {
                        covered = true;
                        break;
                    }
                }
                if (!covered) return;
            }
            answer = Math.min(answer, currentSequences.size());
            return;
        }

        // Include current sequence as a super sequence
        currentSequences.add(sequences[idx]);
        findSuperSequences(idx + 1, currentSequences);

        // Do not include current sequence as a super sequence
        currentSequences.remove(currentSequences.size() - 1);
        findSuperSequences(idx + 1, currentSequences);
    }

    public static boolean matches(String superSeq, String seq) {
        for (int i = 0; i < M; i++) {
            if (seq.charAt(i) != '.' && superSeq.charAt(i) != '.' && seq.charAt(i) != superSeq.charAt(i)) {
                return false;
            }
        }
        return true;
    }
	
}

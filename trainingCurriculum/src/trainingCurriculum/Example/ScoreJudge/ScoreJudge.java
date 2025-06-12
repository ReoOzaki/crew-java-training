package trainingCurriculum.Example.ScoreJudge;

public class ScoreJudge {
    
    // 評価ランクの定数定義
    private static final String GRADE_A = "A";
    private static final String GRADE_B = "B";
    private static final String GRADE_C = "C";
    private static final String GRADE_D = "D";

    public static void main(String[] args) {
        int score = 65;

        // --- if-else if-else 文を使った実装 ---
        if (score >= 90) {
            System.out.println(GRADE_A);
        } else if (score >= 70) {
            System.out.println(GRADE_B);
        } else if (score >= 50) {
            System.out.println(GRADE_C);
        } else {
            System.out.println(GRADE_D);
        }

        // --- 非推奨：独立したif文（重複評価の恐れ） ---
        /*
        if (score >= 90) {
            System.out.println(GRADE_A);
        }
        if (score >= 70) {
            System.out.println(GRADE_B);
        }
        if (score >= 50) {
            System.out.println(GRADE_C);
        }
        */
        
        // 議論のポイント
        // なぜelse ifにする必要があるのか？
        // 複数の条件にマッチする可能性がある場合のリスクは？
    }
}

package trainingCurriculum.Example.MemberCheck;

public class MemberCheck {
	
    // ランクの定数定義（慣例により大文字で）
    private static final String RANK_GOLD = "Gold";
    private static final String RANK_PLATINUM = "Platinum";
	
    public static void main(String[] args) {
        //　あなたの条件
    	int age = 25;
        String rank = "Gold";

        // 次の条件に合うときだけ「特典対象です」と表示する
        // ・20歳以上 AND
        // ・rankが"Gold"または"Platinum"

        // ここに処理を記述
        // かつ・またはを使った書き方
        if (age >= 20 && (rank.equals(RANK_GOLD) || rank.equals(RANK_PLATINUM))) {
            System.out.println("特典対象です");
        }
        
        // 分岐を分けた書き方 
        // if (age >= 20) {
        //     if (rank.equals("Gold") || rank.equals("Platinum")) {
        //         System.out.println("特典対象です");
	    //     }
	    // }
        
        
        // 議論のポイント
        // 1行で書く vs ネストして書く可読性の違い
        // 複雑な条件をif文に全部入れるべきか？
        // String定数はなぜ定義すべきか？ → 「タイポ防止」「意味付け」「複数箇所の共通管理」
        // equals()と定数の順序（RANK_GOLD.equals(rank)と書くべきか？）→ NullPointerException回避のため
    }
}

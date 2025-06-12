package trainingCurriculum.Hint.StudentReport;

import java.util.Arrays;
import java.util.List;

public class StudentReport {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("佐藤", "鈴木", null, "田中", "高橋");
        List<Integer> scores = Arrays.asList(85, null, 70, 92, 58);

        // 上記の2つのListは、名前と点数のペアを表しています（indexが同じなら同一人物）。
        // ただし、どちらのリストにもnullが混ざっています。

        // ■要件：
        // ① 名前または点数がnullの場合、「データ不備」と出力
        // ② 点数が90以上なら「評価：A」
        //    70以上90未満なら「評価：B」
        //    50以上70未満なら「評価：C」
        //    それ未満は「評価：D」
        // ③ 最後に、有効なデータ（nullでないペア）の平均点を表示（小数点以下切り捨て）

        // ヒント①：2つのリストを同時に扱うには、indexを使ってforループで回すのが便利です。
        // 例：for (int i = 0; i < names.size(); i++) { ... }

        // ヒント②：nullチェックには if (names.get(i) == null || scores.get(i) == null) を使いましょう。

        // ヒント③：点数によって成績を分ける処理は if-else if-else で行いましょう。

        // ヒント④：平均を求めるには合計点と有効件数（nullでないペアの数）をカウントしましょう。

        // ヒント⑤：平均点は int型同士の割り算で求めれば小数点以下を切り捨てられます。

        // ↓ここから実装してみましょう。
    }
}

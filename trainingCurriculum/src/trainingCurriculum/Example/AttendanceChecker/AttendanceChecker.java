package trainingCurriculum.Example.AttendanceChecker;

import java.util.*;
// import java.util.Objects;
// import java.util.stream.*;

public class AttendanceChecker {
    public static void main(String[] args) {
        List<String> studentNames = Arrays.asList("田中", null, "佐藤", "山田", null);

        // 拡張for文 + != null（基本・推奨）
        for (String name : studentNames) {
            if (name != null) {
                System.out.println(name.toUpperCase());
            }
        }

        // -------------------------------
        // 拡張for文 + Objects.nonNull（明示的なnullチェック）
        /*
        for (String name : studentNames) {
            if (Objects.nonNull(name)) {
                System.out.println(name.toUpperCase());
            }
        }
        */

        // -------------------------------
        // 通常のfor文 + nullチェック（添え字を使いたい場合）
        /*
        for (int i = 0; i < studentNames.size(); i++) {
            String name = studentNames.get(i);
            if (name != null) {
                System.out.println(name.toUpperCase());
            }
        }
        */

        // -------------------------------
        // Streamでnull除去 → for文で処理（上級・前処理型）
        /*
        List<String> filtered = studentNames.stream()
            .filter(Objects::nonNull)
            .collect(Collectors.toList());

        for (String name : filtered) {
            System.out.println(name.toUpperCase());
        }
        */
        
        // 議論ポイント
        // 通常のfor文 vs 拡張for文
        // nullチェックの書き方
        // 事前にnullを除外するか、for文中で除外するか

    }
}

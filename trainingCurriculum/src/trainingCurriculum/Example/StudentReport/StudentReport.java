package trainingCurriculum.Example.StudentReport;

import java.util.*;

public class StudentReport {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("佐藤", "鈴木", null, "田中", "高橋");
        List<Integer> scores = Arrays.asList(85, null, 70, 92, 58);

        int total = 0;
        int count = 0;

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            Integer score = scores.get(i);

            if (name == null || score == null) {
                System.out.println("[" + i + "] データ不備");
                continue;
            }

            System.out.print("[" + i + "] " + name + " さんの点数：" + score + " → ");

            if (score >= 90) {
                System.out.println("評価：A");
            } else if (score >= 70) {
                System.out.println("評価：B");
            } else if (score >= 50) {
                System.out.println("評価：C");
            } else {
                System.out.println("評価：D");
            }

            total += score;
            count++;
        }

        if (count > 0) {
            System.out.println("有効なデータの平均点：" + (total / count));
        } else {
            System.out.println("有効なデータがありません");
        }
    }
}

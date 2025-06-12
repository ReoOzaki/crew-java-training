package trainingCurriculum.Example.RoleCheck;

public class RoleCheck {
    // ロール名の定数定義（すべて大文字がJavaの慣習）
    private static final String ROLE_ADMIN = "Admin";
    private static final String ROLE_USER = "User";

    public static void main(String[] args) {
        String role = "Admin";

        // --- if-else文によるロール判定 ---
        if (ROLE_ADMIN.equals(role)) {
            System.out.println("管理者としてログイン");
        } else if (ROLE_USER.equals(role)) {
            System.out.println("一般ユーザーとしてログイン");
        } else {
            System.out.println("不正なロールです");
        }

        // --- switch文を用いた代替実装 ---
        /* 
        switch (role) {
            case ROLE_ADMIN:
                System.out.println("管理者としてログイン（switch文）");
                break;
            case ROLE_USER:
                System.out.println("一般ユーザーとしてログイン（switch文）");
                break;
            default:
                System.out.println("不正なロールです（switch文）");
        }
        */

        // --- 非推奨な例（参考用） ---
        /*
        if (role == "Admin") {
            // ⚠ Javaでは文字列比較に==を使うと「参照の比較」になるため誤判定が起こることがある
            System.out.println("管理者としてログイン");
        }
        */
        
        // 議論のポイント
        // equals() vs ==：どう違う？どちらが安全？
        // 定数化の利点（スペルミス防止、IDEの補完、意味の明確化）
        // if-else と switch の使い分け
        // どちらが可読性が高い？
        // 条件が増えたときどちらが拡張しやすい？
    }
}

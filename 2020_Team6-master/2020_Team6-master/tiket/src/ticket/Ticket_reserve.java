package ticket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ticket_reserve {

    //フィールド定義
    String url = "jdbc:mysql://localhost/soft";
    String user = "user1";
    String pass = "pass";

    //reserveで取り出した結果の保存用
    int[] apo_id = new int[255];
    int[] apo_number = new int[255];
    int[] user_id = new int[255];
    int[] menu_id = new int[255];
    int num = 0;

    //insertメソッド（予約を実際に行う）
    public void tiketer(int id, int menu_id) {

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        //JDBCの設定 
        //jdbc:mysql://localhost/データベース名
        try {
            //デーテベースに接続
            con = DriverManager.getConnection(url, user, pass);

            //ステートメントの作成
            stmt = con.createStatement();

            //SQL文の作成
            String sql = String.format("insert into apo_info(menu_id, user_id) values (%d, %d)", menu_id, id);

            //SQLの実行 
            int num = stmt.executeUpdate(sql);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            try {
                rs.close();
                stmt.close();
                con.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }

    //reservation()メソッド・予約情報を取得する
    public void reservation() {

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        //JDBCの設定 
        //jdbc:mysql://localhost/データベース名
        try {
            //デーテベースに接続
            con = DriverManager.getConnection(url, user, pass);

            //ステートメントの作成
            stmt = con.createStatement();

            //SQL文の作成
            String sql = "select * from apo_info";

            //SQLの実行
            rs = stmt.executeQuery(sql);

            //rsから結果を取り出す
            while (rs.next()) {
                apo_id[num] = rs.getInt("apo_id");
                apo_number[num] = rs.getInt("apo_number");
                user_id[num] = rs.getInt("user_id");
                menu_id[num] = rs.getInt("menu_id");
                num++;

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            try {
                rs.close();
                stmt.close();
                con.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }

    //各種ゲッターメッソッド
    public int getApo_id(int i) {
   if (i >= 0 && num > i) {
            return apo_id[i];
        } else {
            return 0;
        }
    }

    public int getApo_number(int i) {
        if (i >= 0 && num > i) {
            return apo_number[i];
        } else {
            return 0;
        }
    }

    public int getUser_id(int i) {
        if (i >= 0 && num > i) {
            return user_id[i];
        } else {
            return 0;
        }
    }

    public int getMenu_id(int i) {

        if (i >= 0 && num > i) {
            return menu_id[i];
        } else {
            return 0;
        }
    }

    public int getNum() {
        return num;
    }
}

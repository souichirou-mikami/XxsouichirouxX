
package menu_info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class menu_info {

    
    String menu_name;
    float menu_cal;
    float menu_pro;
    float menu_fat;
    float menu_car;
    float menu_salt;

    //food()メソッド、menu_idから献立情報を取得する

    public void food(int menu_id) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        //JJDBCの設定 
        //jjdbc:mysql://localhost/データベース名
        String url = "jdbc:mysql://localhost/soft";
        String user = "user1";
        String pass = "pass";
        try {
            //デーテベースに接続
            con = DriverManager.getConnection(url, user, pass);

            //ステートメントの作成
            stmt = con.createStatement();

            //SQL文の作成
            String sql = String.format("select * from menu_info where menu_id = %d", menu_id);

            //SQLの実行
            rs = stmt.executeQuery(sql);

            //rsから結果を取り出す
            while (rs.next()) {
                menu_name = rs.getString("menu_name");
                menu_cal = rs.getFloat("menu_cal");
                menu_pro = rs.getFloat("menu_pro");
                menu_fat = rs.getFloat("menu_fat");
                menu_car = rs.getFloat("menu_car");
                menu_salt = rs.getFloat("menu_solt");

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

    public String getMenu_name() {
        return menu_name;
    }

    public float getMenu_cal() {
        return menu_cal;
    }

    public float getMenu_pro() {
        return menu_pro;
    }

    public float getMenu_fat() {
        return menu_fat;
    }

    public float getMenu_car() {
        return menu_car;
    }

    public float getMenu_salt() {
        return menu_salt;
    }

}

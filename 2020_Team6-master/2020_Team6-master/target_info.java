import java.sql.*;

public class target_info {

    protected int [] target_id = new int[256];
    protected float[] cal = new float[256]; 
    protected float[] pro = new float[256];
    protected float[] fat = new float[256];
    protected float[] car = new float[256];
    protected float[] salt = new float[256];
    protected int num;

    public void dataload() throws Exception { 

        num = 0; //取得件数の初期化
        Class.forName("com.mysql.jdbc.Driver").newInstance(); //com.mysql.jdbc.Driverはドライバのクラス名
        String url = "jdbc:mysql://localhost/soft?characterEncoding=UTF-8";
        Connection conn = DriverManager.getConnection(url, "user1", "pass"); //上記URL設定でユーザ名とパスワードを使って接続

        //SELECT文の実行
        String sql = "SELECT * FROM target_info"; //SQL文の設定 ?などパラメータが必要がない場合は通常のStatementを利用
        PreparedStatement stmt = conn.prepareStatement(sql); //JDBCのステートメント（SQL文）の作成
        ResultSet rs = stmt.executeQuery(); //ステートメントを実行しリザルトセットに代入

        //rsから結果を取り出す
        while (rs.next()) { 
            this.target_id[num] = rs.getInt("target_id");
            this.cal[num] = rs.getFloat("cal");
            this.pro[num] = rs.getFloat("pro");
            this.fat[num] = rs.getFloat("fat");
            this.car[num] = rs.getFloat("car");
            this.salt[num] = rs.getFloat("salt");
            num++;
        }

        rs.close();
        stmt.close();
        conn.close();
    }

    public int getTarget_id(int i) {
        if (i >= 0 && num > i) {
            return target_id[i];
        } else {
            return "";
        }
    }

    public float getCal(int i) {
        if (i >= 0 && num > i) {
            return cal[i];
        } else {
            return "";
        }
    }

    public float getPro(int i) {
        if (i >= 0 && num > i) {
            return pro[i];
        } else {
            return "";
        }
    }

    public float getFat(int i) {
        if (i >= 0 && num > i) {
            return fat[i];
        } else {
            return "";
        }
    }

    public float getCar(int i) {
        if (i >= 0 && num > i) {
            return car[i];
        } else {
            return "";
        }
    }

    public float getSalt(int i) {
        if (i >= 0 && num > i) {
            return salt[i];
        } else {
            return "";
        }
    }

    public int getNum() {
        return num;
    }

}

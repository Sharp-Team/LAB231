package modal;

import db.DBContext;
import entity.Article;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Thaycacac
 */
public class ArticleDAO {

    public ArrayList<Article> getArticle(int numberArticle, int typeArticle) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT TOP (?) * "
                + "FROM Article WHERE type = (?)"
                + "ORDER BY Date DESC";

        ArrayList<Article> listArticle = new ArrayList<>();
        try {
            DBContext db = new DBContext();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, numberArticle);
            ps.setInt(2, typeArticle);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt(1);
                int type = rs.getInt(2);
                String title = rs.getString(3);
                String content = rs.getString(4);
                String image = rs.getString(5);
                Date date = rs.getDate(6);

                Article article = new Article(id, type, title, content, image, date);
                listArticle.add(article);
            }
            rs.close();
            ps.close();
            con.close();
            return listArticle;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}

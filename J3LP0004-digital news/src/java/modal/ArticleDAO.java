package modal;

import entity.Article;
import db.DBContext;
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

    public ArrayList<Article> getRecentArticle(int numberArticle) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT TOP (?) * "
                + "FROM Article \n"
                + "ORDER BY Date DESC";
        
        ArrayList<Article> listArticle = new ArrayList<>();
        try {
            DBContext db = new DBContext();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, numberArticle);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt(1);
                String title = rs.getString(2);
                String image = rs.getString(3);
                String content = rs.getString(4);
                Date date = rs.getDate(5);
                String author = rs.getString(6);
                Article article = new Article(id, title, image, content, date, author);
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

    public Article getArticleById(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT title, image, content, date, author FROM Article WHERE id = ?";

        try {
            DBContext db = new DBContext();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                String title = rs.getString(1);
                String image = rs.getString(2);
                String content = rs.getString(3);
                Date date = rs.getDate(4);
                String author = rs.getString(5);
                return new Article(id, title, image, content, date, author);
            }
            rs.close();
            ps.close();
            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<Article> getListAticleSearch(int numberArticleInPage, int pageCurrent, String keyword) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Article> listArticle = new ArrayList<>();

        String sql = "SELECT * FROM (\n"
                + "SELECT ROW_NUMBER()\n"
                + "OVER(ORDER BY id) as Number,\n"
                + "* FROM Article \n"
                + "WHERE content LIKE '%?%' OR title LIKE '%?%'\n"
                + ") as DataSearch where Number between ? and ?";
        try {
            DBContext db = new DBContext();

            /*
            example: 2 article in one page
            page 1 => 1,2...
            page 2 => 3,4...
             */
            int articleFrom = pageCurrent * numberArticleInPage - 1;
            int articleTo = articleFrom + numberArticleInPage - 1;

            con = db.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, keyword);
            ps.setString(2, keyword);
            ps.setInt(3, articleFrom);
            ps.setInt(4, articleTo);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt(2);
                String title = rs.getString(3);
                String image = rs.getString(4);
                String content = rs.getString(5);
                Date date = rs.getDate(6);
                String author = rs.getString(7);
                Article article = new Article(id, title, image, content, date, author);
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

    public int getNumberPage(int numberArticleInPage, String keyword) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Article> listArticle = new ArrayList<>();
        String sql = "SELECT COUNT(id) FROM Article \n"
                + "WHERE content\n"
                + "LIKE '%?%' OR title LIKE '%?%'";
        try {
            DBContext db = new DBContext();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, keyword);
            ps.setString(2, keyword);
            rs = ps.executeQuery();

            while (rs.next()) {
                int numberArticle = rs.getInt(1);
                // round up the page number
                return (numberArticle + (numberArticle % numberArticleInPage)) / numberArticleInPage;
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }
}

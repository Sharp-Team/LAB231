package controller;

import entity.Article;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.Articles;

/**
 *
 * @author Thaycacac
 */
public class ViewArticle extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            Articles articles = new Articles();

            Article article = articles.getArticleById(id);

            if (article == null) {
                response.sendRedirect("error.jsp");
            }

            ArrayList<Article> fiveRecentAticle = articles.getRecentArticle(5);
            request.setAttribute("fiveRecentAticle", fiveRecentAticle);

            request.setAttribute("mostRecentArticle", article);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

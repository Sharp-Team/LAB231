package Controller;

import entity.Article;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.ArticleDAO;

/**
 *
 * @author Thaycacac
 */
public class About extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
        ArticleDAO articleDAO = new ArticleDAO();
        Article articleAbout = articleDAO.getArticle(1, 3).get(0);

        request.setAttribute("articleAbout", articleAbout);

        request.getRequestDispatcher("/about.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("Error", "Error");
            request.getRequestDispatcher("/about.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}

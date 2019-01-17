package controller;

import entity.Article;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modal.Articles;

/**
 *
 * @author Thaycacac
 */
public class Search extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            final int ARTICLE_PAGE = 2;
            HttpSession session = request.getSession();

            int pageCurrent = Integer.parseInt(request.getParameter("page"));
            String keyword = (String) session.getAttribute("keyword");

            Articles articles = new Articles();
            Article mostRecentArticle = articles.getRecentArticle(1).get(0);
            request.setAttribute("mostRecentArticle", mostRecentArticle);

            ArrayList<Article> fiveRecentAticle = articles.getRecentArticle(5);
            request.setAttribute("fiveRecentAticle", fiveRecentAticle);

            ArrayList<Article> listSearch = articles.getListAticleSearch(ARTICLE_PAGE, pageCurrent, keyword);
            request.setAttribute("listSearch", listSearch);

            int numberPage = articles.getNumberPage(ARTICLE_PAGE, keyword);
            request.setAttribute("numberPage", numberPage);

            if (listSearch.size() == 0) {
                request.setAttribute("result", false);
            }

            request.getRequestDispatcher("/search.jsp").forward(request, response);
        } catch (Exception ex) {
            response.sendRedirect("error.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String keyword = request.getParameter("keyword");

        HttpSession session = request.getSession();
        session.setAttribute("keyword", keyword);

        response.sendRedirect("Search?page=1");
    }
}

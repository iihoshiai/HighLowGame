package highlow.servlet;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import highlow.model.Card;
import highlow.model.GameCard;
import highlow.model.HighLow;
@WebServlet("/highlow")
public class HighLowServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		HighLow highlow = new HighLow();
		
		request.setAttribute("HighLow", highlow);
        session.setAttribute("HighLow", highlow);
        
        
		Card firstCard = GameCard.getFirstCard();
		String firstimag =GameCard.imags(firstCard);
        request.setAttribute("firstimag", firstimag);
        session.setAttribute("firstimag", firstimag);
        
        Card secondCard = GameCard.getSecondCard();
		String secondimag =GameCard.imags(secondCard);
        request.setAttribute("secondimag", secondimag);
        session.setAttribute("secondimag", secondimag);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/highlow.jsp");
        dispatcher.forward(request, response);
	}
}


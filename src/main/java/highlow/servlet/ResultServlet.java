package highlow.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import highlow.model.Card;
import highlow.model.GameCard;
import highlow.model.HighLow;

public class ResultServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		HighLow highlow = (HighLow)session.getAttribute("highlow");
		String firstimag = (String)session.getAttribute("firstimag");
		String secondimag = (String)session.getAttribute("secondimag");
		String choice = request.getParameter("choice");
		
		Card firstCard = GameCard.getFirstCard();
		int firstNumber = firstCard.getNumber();
		Card secondCard = GameCard.getSecondCard();
		int secondNumber = secondCard.getNumber();
		
		String result;
		if(choice.equals("high") && firstNumber<secondNumber) {
			result ="You Win!";
		}else if(choice.equals("low") && firstNumber>secondNumber) {
			result ="You Win!";
		}else {
			result = "You Lose!";
		}
		request.setAttribute("result", result);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/result.jsp");
        dispatcher.forward(request, response);
	}

}

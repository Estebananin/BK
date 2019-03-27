package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.vo.Usuario;
import utils.Utils;

/**
 * Servlet implementation class ServletUser
 */
@WebServlet("/ServletUser")
public class ServletUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Usuario usuario = new Usuario();
		System.out.println("Registrar.doPost()");
		String s = utils.Utils.readParams(request);
		System.out.println("conexion correcta");

		//

		System.out.println("aaaaa");
		Gson gson = new Gson();
		System.out.println("bbbbbb");
		Utils util = new Utils();
		System.out.println("holi");

		// ACÁ SE ROMPE

		Utils.fromJson(s, Usuario.class);
		System.out.println("pasó");
	}

}

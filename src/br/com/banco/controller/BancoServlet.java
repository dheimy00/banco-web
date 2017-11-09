package br.com.banco.controller;

import java.io.IOException;
import java.util.List;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.banco.enumerator.EnumAcao;
import br.com.banco.modelo.entidades.Banco;
import br.com.banco.service.BancoService;
import br.com.banco.view.arquitetura.Controller;

@WebServlet("/BancoServlet")
public class BancoServlet extends Controller<Banco, BancoService> {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {


		String acao = request.getParameter("acao");

		Banco banco = obterBancoRequest(request);

		if (acao.equalsIgnoreCase(EnumAcao.SALVAR.getDescricao())) {

			super.salvar(banco);
		}
//		} else {
//
//
//			List<Banco> bancos = super.consultar(banco);
//
//			request.setAttribute("bancos", bancos);
//
//		}
//
//		//response.sendRedirect("paginas/banco/cadastro-banco.jsp");
//
//		RequestDispatcher rd = request.getRequestDispatcher("/paginas/banco/cadastroBanco.jsp");
//
//		rd.forward(request, response);
//
	}

	private Banco obterBancoRequest(HttpServletRequest request) {
		String numero = request.getParameter("txtNumero");

		String nome = request.getParameter("txtNome");

		Banco banco = new Banco();


		banco.setNumero(Integer.parseInt(numero));


		banco.setNome(nome);
		return banco;
	}

}

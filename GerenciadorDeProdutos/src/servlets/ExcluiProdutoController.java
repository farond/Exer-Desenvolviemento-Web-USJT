package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Produto;
import service.ProdutoService;

	@WebServlet("/excluirProduto.do")
	public class ExcluiProdutoController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
      
	private final ProdutoService produtoService = new ProdutoService(); 
	
	/**
	 * Método responsável por deletar um professor pela matricula
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Produto produto = new Produto();
		produto.setCodigo(Integer.parseInt(request.getParameter("codigo")));
		
		produtoService.deletarProduto(produto);
		
		response.sendRedirect("listaProdutos.do");
	}
}

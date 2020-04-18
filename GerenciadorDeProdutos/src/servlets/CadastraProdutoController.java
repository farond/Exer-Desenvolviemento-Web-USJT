package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Produto;
import service.ProdutoService;





@WebServlet("/cadastrarProduto.do")
public class CadastraProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final ProdutoService produtoService = new ProdutoService(); 
       
	/**
	 * Método responsável por cadastrar um professor 
	 */
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
		PrintWriter out= response.getWriter();
		
		Produto produto = new Produto();
		produto.setCodigo(Integer.parseInt(request.getParameter("codigo")));
		produto.setNome(request.getParameter("nome"));
		produto.setDescricao(request.getParameter("descricao"));		
		produto.setValor(Double.parseDouble(request.getParameter("valor")));
		produto.setEstoque(Integer.parseInt(request.getParameter("estoque")));
		
		produtoService.cadastrarProduto(produto);
		
		
		 if(produto != null){  
	            out.print("<p>Produto Salvo com Sucesso!</p>");  
	            request.getRequestDispatcher("index.html").include(request, response); 
	            
	        }else{  
	            out.println("Desculpe não foi possivel Salvar");  
	        }  
		
		 out.close();  
		
	}

}

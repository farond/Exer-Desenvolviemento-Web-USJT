package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Produto;
import service.ProdutoService;






@WebServlet("/listaProdutos.do")
public class ListaProdutosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final ProdutoService produtoService = new ProdutoService(); 

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html"); 
		response.getWriter().println("<a href='index.html'>Adicionar Novo Produto</a>");
		response.getWriter().println("<h1>Lista de Produtos</h1>");
		response.getWriter().println("<title>Gerenciador de Produtos</title>");
		
		List<Produto> listaProduto = produtoService.listarProdutos();
		
		
		for(Produto produto : listaProduto) {
			response.getWriter().println(
					"<table border='1px'width='100%'>"
							+"<tr>"
								+"<th>Código Produto</th>"
								+"<th>Nome</th>"
								+"<th>Descrição</th>"
								+"<th>Valor</th>"
								+"<th>Estoque</th>"
								+"<th>Atualizar</th>"
								+"<th>Deletar</th>"
							+"</tr>"
							+"<tr>"
								+"<td>"+produto.getCodigo()+"</td>"
								+"<td>"+produto.getNome()+"</td>"
								+"<td>"+produto.getDescricao()+"</td>"
								+"<td>"+produto.getValor()+"</td>"
								+"<td>"+produto.getEstoque()+"</td>"
								+"<td><a href=atualizaProduto.do?codigo="+produto.getCodigo()+">Atualizar</a></td>"
								+"<td><a href=excluirProduto.do?codigo="+produto.getCodigo()+">excluir</a></td>"
							+"</tr>"
					+"</table>");
		}
	}
}

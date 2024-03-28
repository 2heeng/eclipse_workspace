package sec03.brd01;

import java.util.List;

public class BoardService {

	BoardDAO boardDAO;
	
	public BoardService() {
		boardDAO=new BoardDAO();
	}
	
	List<ArticleVO> listArticles() {
		return boardDAO.selectAllArticles();
	}
	
	//새글추가
	public void addArticle(ArticleVO articleVO){
		boardDAO.insertNewArticle(articleVO);
		
	}
	
	public ArticleVO viewArticle(int articleNO) {
		ArticleVO article=null;
		article = boardDAO.selectArticle(articleNO);
		return article;
	}
	
	
	public void modArticle(ArticleVO article) {
		boardDAO.updateArticle(article);
	}
	
	//글삭제(자식글까지 삭제, 결과를 글 목록(리스트)로 돌아가게)
	public List<Integer> removeArticle(int articleNO){
		
		List<Integer> articleNOList = boardDAO.selectRemoveArticles(articleNO);
		boardDAO.deleteArticle(articleNO);
		
		return articleNOList;
		
	}
}

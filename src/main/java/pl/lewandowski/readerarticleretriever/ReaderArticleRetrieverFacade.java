package pl.lewandowski.readerarticleretriever;


import pl.lewandowski.authorarticlecud.AuthorArticleCudFacade;

public class ReaderArticleRetrieverFacade {

    AuthorArticleCudFacade authorArticleCudFacade;

    public ReaderArticleRetrieverFacade(AuthorArticleCudFacade authorArticleCudFacade) {
        this.authorArticleCudFacade = authorArticleCudFacade;
    }

    public ArticleDto retrievalById(Long id) {

        pl.lewandowski.authorarticlecud.ArticleDto foundArticle = authorArticleCudFacade.findAllArticles().stream()
                .filter(articleDto -> articleDto.id().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("not found error"));

        return ArticleDto.builder()
                .id(foundArticle.id())
                .header(foundArticle.header())
                .build();
    }
}

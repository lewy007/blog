package pl.lewandowski.readerarticleretriever;


public class ReaderArticleRetrieverFacade {

    public ArticleDto retrievalById(Long id) {
        return ArticleDto.builder()
                .id(1L)
                .header("jak zostac programista")
                .content("5 krokow: 1, 2, 3, 4")
                .category("IT")
                .build();
    }
}

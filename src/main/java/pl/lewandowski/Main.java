package pl.lewandowski;

import pl.lewandowski.authorarticlecud.ArticleCreateDto;
import pl.lewandowski.authorarticlecud.ArticleDto;
import pl.lewandowski.authorarticlecud.AuthorArticleCudFacade;
import pl.lewandowski.readerarticleretriever.ReaderArticleRetrieverFacade;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // autor/admin dodaje wpis
        AuthorArticleCudFacade authorArticleCudFacade = new AuthorArticleCudFacade();

        System.out.println("1. zapisywanie artykulu przez admina");

        authorArticleCudFacade.saveArticle(new ArticleCreateDto(
                "header1",
                "content1",
                "category1"
        ));
        authorArticleCudFacade.saveArticle(new ArticleCreateDto(
                "header2",
                "content2",
                "category2"
        ));
        authorArticleCudFacade.saveArticle(new ArticleCreateDto(
                "header3",
                "content3",
                "category3"
        ));
        authorArticleCudFacade.saveArticle(new ArticleCreateDto(
                "header4",
                "content4",
                "category4"
        ));

        System.out.println("2. Artykuł zapisany przez admina");
        //autor/admin pobiera wpisy
        Set<ArticleDto> allArticles = authorArticleCudFacade.findAllArticles();
        System.out.println("3. Wszystkie wpisy wyswietlone przez admina");
        allArticles.forEach(System.out::println);

        //Czytelnik pobiera wpisy
        System.out.println("4. Czytelnik wyswietla wpis o id 0");
        ReaderArticleRetrieverFacade readerArticleRetrieverFacade
                = new ReaderArticleRetrieverFacade(authorArticleCudFacade);
        pl.lewandowski.readerarticleretriever.ArticleDto articleDto = readerArticleRetrieverFacade.retrievalById(0L);
        System.out.println(articleDto);
    }
}
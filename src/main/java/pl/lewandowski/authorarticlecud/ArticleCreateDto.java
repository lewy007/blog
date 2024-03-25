package pl.lewandowski.authorarticlecud;

public record ArticleCreateDto(
        String header,
        String content,
        String category
) {
}

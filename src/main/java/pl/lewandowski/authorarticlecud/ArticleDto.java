package pl.lewandowski.authorarticlecud;

public record ArticleDto(
        Long id,
        String header,
        String content,
        String category
) {
}

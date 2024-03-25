package pl.lewandowski.readerarticleretriever;

import lombok.Builder;

@Builder
public record ArticleDto(
        Long id,
        String header
) {
}

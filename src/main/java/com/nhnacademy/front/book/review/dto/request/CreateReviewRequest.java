package com.nhnacademy.front.book.review.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import java.util.List;

/**
 * 리뷰 요청 dto 입니다.
 *
 * @param title     제목
 * @param content   내용
 * @param ratings   별점
 * @param imageList 이미지 리스트
 * @author 김은비
 */
@Builder
public record CreateReviewRequest(
        @Size(min = 1, max = 50) String title,
        @NotNull String content,
        double ratings,
        List<String> imageList
) {
}

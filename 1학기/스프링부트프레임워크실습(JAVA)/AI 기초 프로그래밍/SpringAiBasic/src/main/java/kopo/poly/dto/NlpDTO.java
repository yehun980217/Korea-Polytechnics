package kopo.poly.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class NlpDTO {
    private String text; // 분석할 문장
    private String result; // 분석한 폼사 결과
    private List<String> nouns; // 분석된 명사 주출 결과
}

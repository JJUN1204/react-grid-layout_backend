package stnInfotech.grid_layout.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GridDTO {
    private String i;
    private Integer x;
    private Integer y;
    private Integer w;
    private Integer h;
    private Integer minW;
    private Integer maxW;
    private Integer minH;
    private Integer maxH;
    private Integer isStatic; // boolean으로 수정
    private String chartType;

    @Override
    public String toString() {
        return "GridDTO{" +
                "i='" + i + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", w=" + w +
                ", h=" + h +
                ", minW=" + minW +
                ", maxW=" + maxW +
                ", minH=" + minH +
                ", maxH=" + maxH +
                ", isStatic=" + isStatic +
                ", chartType=" + chartType +
                '}';
    }
}

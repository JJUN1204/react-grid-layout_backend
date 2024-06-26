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
    private int x;
    private int y;
    private int w;
    private int h;

    @Override
    public String toString() {
        return "GridDTO{" +
                ", i='" + i + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", w=" + w +
                ", h=" + h +
                '}';
    }
}

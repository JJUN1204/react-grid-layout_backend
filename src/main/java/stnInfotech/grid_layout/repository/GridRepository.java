package stnInfotech.grid_layout.repository;

import org.apache.ibatis.annotations.Mapper;
import stnInfotech.grid_layout.dto.GridDTO;

import java.util.List;

@Mapper
public interface GridRepository {
    List<GridDTO> getLayouts();
    void updateLayout(GridDTO gridDTO);
}

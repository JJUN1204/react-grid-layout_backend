package stnInfotech.grid_layout.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;
import stnInfotech.grid_layout.dto.GridDTO;

import java.util.List;

@Mapper
public interface GridRepository {
    List<GridDTO> getLayouts();
    void updateLayout(GridDTO gridDTO);

    void insertLayout(GridDTO gridDTO);

    void deleteLayout(String i);
}

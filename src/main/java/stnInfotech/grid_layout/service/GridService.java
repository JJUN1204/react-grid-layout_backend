package stnInfotech.grid_layout.service;

import stnInfotech.grid_layout.dto.GridDTO;
import stnInfotech.grid_layout.etc.Result;

import java.util.List;

public interface GridService {
    List<GridDTO> getLayouts();
    Result saveLayouts(List<GridDTO> gridDTOList);
}

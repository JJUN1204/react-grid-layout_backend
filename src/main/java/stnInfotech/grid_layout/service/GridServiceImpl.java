package stnInfotech.grid_layout.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import stnInfotech.grid_layout.dto.GridDTO;
import stnInfotech.grid_layout.etc.Result;
import stnInfotech.grid_layout.repository.GridRepository;

import java.util.List;

@Service
public class GridServiceImpl implements GridService {

    private final GridRepository gridRepository;

    @Autowired
    public GridServiceImpl(GridRepository gridRepository) {
        this.gridRepository = gridRepository;
    }

    @Override
    public List<GridDTO> getLayouts() {
        return gridRepository.getLayouts();
    }

    @Override
    @Transactional
    public Result saveLayouts(List<GridDTO> gridDTOList) {
        for (GridDTO gridDTO : gridDTOList) {
            System.out.println(gridDTO);
            gridRepository.updateLayout(gridDTO);
        }
        return new Result("UPDATE_COMPLETE");
    }
}

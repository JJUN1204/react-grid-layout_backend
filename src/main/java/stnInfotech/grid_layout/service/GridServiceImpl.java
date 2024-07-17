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
    public Result deleteLayout(String i) {
        try {
            gridRepository.deleteLayout(i);
            return new Result("DELETE_COMPLETE");
        }catch (Exception e){
            e.printStackTrace();
            return new Result("error");
        }
    }

    @Override
    public Result saveLayouts(List<GridDTO> gridDTOList) {
        try {
            for (GridDTO gridDTO : gridDTOList) {
                System.out.println(gridDTO);
                gridRepository.updateLayout(gridDTO);
            }
            return new Result("UPDATE_COMPLETE");
        }catch (Exception e){
            e.printStackTrace();
            return new Result("error");
        }

    }

    @Override
    public Result insertLayout(GridDTO gridDTO) {
        try{
            gridRepository.insertLayout(gridDTO);
            return new Result("INSERT_COMPLETE");
        }catch (Exception e){
            e.printStackTrace();
            return new Result("error");
        }

    }
}

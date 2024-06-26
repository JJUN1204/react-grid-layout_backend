package stnInfotech.grid_layout.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stnInfotech.grid_layout.dto.GridDTO;
import stnInfotech.grid_layout.etc.Result;
import stnInfotech.grid_layout.service.GridService;

import java.util.List;

@RestController
@CrossOrigin("*")
public class GridController {
    private final GridService gridService;

    @Autowired
    public GridController(GridService gridService) {
        this.gridService = gridService;
    }

    @GetMapping("/layouts")
    public List<GridDTO> getLayouts() {
        return gridService.getLayouts();
    }

    @PutMapping("/saveLayouts")
    public ResponseEntity<Result> saveLayouts(@RequestBody List<GridDTO> gridDTOList) {
        System.out.println(gridDTOList);
        return ResponseEntity.ok(gridService.saveLayouts(gridDTOList));
    }
}

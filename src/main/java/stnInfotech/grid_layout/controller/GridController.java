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

    @PostMapping("/generateLayouts")
    public ResponseEntity<Result> generateLayouts(
           @RequestBody GridDTO gridDTO
            ){
        //GridDTO gridDTO = new GridDTO(i,x,y,w,h,null,null,null,null,null);
        return ResponseEntity.ok(gridService.insertLayout(gridDTO));
    }

    @DeleteMapping("/deleteLayout")
    public ResponseEntity<Result> deleteLayout(@RequestParam("i") String i){
        System.out.println(i);
        return ResponseEntity.ok(gridService.deleteLayout(i));
    }
}

package stnInfotech.grid_layout.etc;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data

public class Result {
    private String result;

    public Result(String result) {
        this.result = result;
    }
}

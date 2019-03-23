package tree.cloud;

import java.util.List;
// end::allButValidation[]
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
// tag::allButValidation[]
import lombok.Data;

@Data
public class Tree {

    private String name;
    // tag::allButValidation[]
    private List<String> ingredients;

}

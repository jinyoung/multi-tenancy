package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Accepted extends AbstractEvent {

    private Long id;
    private Long orderId;

    public Accepted(Cooking aggregate) {
        super(aggregate);
    }

    public Accepted() {
        super();
    }
}

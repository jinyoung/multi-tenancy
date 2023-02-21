package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class AddressChanged extends AbstractEvent {

    private Long id;

    public AddressChanged(Order aggregate) {
        super(aggregate);
    }

    public AddressChanged() {
        super();
    }
}

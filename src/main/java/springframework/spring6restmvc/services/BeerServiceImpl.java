package springframework.spring6restmvc.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import springframework.spring6restmvc.model.Beer;
import springframework.spring6restmvc.model.BeerStyle;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public Beer getBeerById(UUID id) {

        log.debug("Get Beer Id in service. Id:" + id.toString());

        return Beer.builder()
                .id(id)
                .version(1)
                .beerName("Galaxy")
                .beerStyle(BeerStyle.PALE_ALE)
                .upc("123")
                .price(new BigDecimal(12.3))
                .quantityOnHand(333)
                .createDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();
    }
}

package top.shop.shop1_service.dto.discount;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PrivateDiscountDto extends DiscountDto {
    private String promoCode;
    private boolean isStacking;
    private String customerEmail;
    private boolean isApplied;
}

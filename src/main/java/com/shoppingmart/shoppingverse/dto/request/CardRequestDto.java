package com.shoppingmart.shoppingverse.dto.request;


import com.shoppingmart.shoppingverse.Enum.CardType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CardRequestDto {

    String customerMobile;

    String cardNo;

    int cvv;

    Date validTill;

    CardType cardType;
}

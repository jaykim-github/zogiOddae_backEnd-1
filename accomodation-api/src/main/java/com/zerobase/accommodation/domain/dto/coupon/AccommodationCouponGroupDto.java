package com.zerobase.accommodation.domain.dto.coupon;

import com.zerobase.accommodation.domain.entity.coupon.AccommodationCouponGroup;
import com.zerobase.accommodation.domain.type.CouponTarget;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccommodationCouponGroupDto {
    private Long id;

    private Long salePrice;
    private CouponTarget couponTarget;
    private Integer issusedcount;

    private LocalDateTime endTime;

    public static AccommodationCouponGroupDto from(AccommodationCouponGroup accommodationCouponGroup) {
        return AccommodationCouponGroupDto.builder()
            .id(accommodationCouponGroup.getId())
            .salePrice(accommodationCouponGroup.getSalePrice())
            .couponTarget(accommodationCouponGroup.getCouponTarget())
            .issusedcount(accommodationCouponGroup.getIssusedcount())
            .endTime(accommodationCouponGroup.getEndTime())
            .build();
    }
}
package com.tpf.automation.tpf_automation.entity.momo;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MomoInsurance {
        private String vapProduct;
        private String vapTreatment;
        private String vapAmount;
        private String insuranceCompany;
}

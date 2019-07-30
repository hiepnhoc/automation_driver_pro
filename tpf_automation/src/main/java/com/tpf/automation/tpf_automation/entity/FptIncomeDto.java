package com.tpf.automation.tpf_automation.entity;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FptIncomeDto  implements Serializable {
    private String incomeHead;
    private String frequency;
    private String amount;
    private String percentage;
}

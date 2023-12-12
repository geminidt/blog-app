package com.vti.blogapp.form;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PostFilterForm {
    private String search;
    // 2020-09-20 -> 2022-06-21 Tìm kiếm theo khoảng ngày chứ ko quan tâm giờ
    // 2023-10-10 16:32:20 Không cần tới Time như gốc
    private LocalDate minCreatedDate;
    private LocalDate maxCreatedDate;
}

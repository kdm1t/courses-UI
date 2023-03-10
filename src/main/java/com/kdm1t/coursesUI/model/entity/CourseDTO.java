package com.kdm1t.coursesUI.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class CourseDTO {

    private Long id;

    private String name;

    private Integer duration;

    private Double price;

    private Owner owner;

    private JobGuarantee jobGuarantee;

    private Direction directionOfStudy;

    private Credit credit;

    @Data
    @NoArgsConstructor
    @ToString
    public static class Credit {
        private Boolean available;
        private Double priceInMonth;
    }

    @Data
    @NoArgsConstructor
    @ToString
    public static class Direction {
        private String directionOfStudy;
    }

    @Data
    @NoArgsConstructor
    @ToString
    public static class JobGuarantee {
        private Boolean jobGuarantee;
    }

    @Data
    @NoArgsConstructor
    @ToString
    public static class Owner {
        private String organization;
    }

}

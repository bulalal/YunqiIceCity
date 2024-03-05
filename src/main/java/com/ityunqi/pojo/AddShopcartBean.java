package com.ityunqi.pojo;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class AddShopcartBean {
    private Integer id;
    private String milkteaname;
    private String introduce;
    private Integer price;
    private String image;

}

package com.kbstar.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {
    private int id;
    private int userId;
    private int itemId;
    private int price;
    private LocalDateTime rdate;
    private String name;
    private String zipcode;
    private String addr;
    private String tel;
    private int cnt;
    private String itemName;

    public void setId(int id) {
        this.id = id;
    }
}

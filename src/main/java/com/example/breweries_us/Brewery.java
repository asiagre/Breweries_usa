package com.example.breweries_us;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
class Brewery {

    @Id
    @GeneratedValue
    private Long id;
    private String brewery_id;
    private String address;
    @Lob
    private String categories;
    private String city;
    private String country;
    @Lob
    private String hours;
    @Column(name = "brewery_keys")
    private String keys;
    private String latitude;
    private String longitude;
    @Lob
    private String menus;
    private String name;
    private String postalCode;
    private String province;
    private String twitter;
    @Lob
    private String websites;
}

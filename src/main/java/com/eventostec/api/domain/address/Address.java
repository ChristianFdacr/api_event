package com.eventostec.api.domain.address;


import com.eventostec.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity (name = "address")
public class Address {

    @Id
    @GeneratedValue
    private UUID id;

    private String city;
   private String uf;

   @ManyToOne
   @JoinColumn(name = "event_id")
   private Event event;

}

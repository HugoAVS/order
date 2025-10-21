package com.jeodldev.order.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sequence")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Sequence {
    @Id
    private String id;
    private Long sequence;
    
}

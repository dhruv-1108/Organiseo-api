package com.organiscoapi.payload;

import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import com.organiscoapi.entity.Board;
import com.organiscoapi.entity.Task;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LabelDTO {
	private UUID id;

   
    private Board board;

  
    private String name;

    
    private String color;

    
    private Set<Task> tasks = new HashSet<>();
}

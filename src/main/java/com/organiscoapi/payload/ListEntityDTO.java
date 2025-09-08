package com.organiscoapi.payload;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.springframework.data.annotation.CreatedDate;

import com.organiscoapi.entity.Board;
import com.organiscoapi.entity.Label;
import com.organiscoapi.entity.ListEntity;
import com.organiscoapi.entity.Task;
import com.organiscoapi.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ListEntityDTO {
	 private UUID id;


	    private Board board;


	    private String name;

	
	    private BigDecimal  position;


	    private OffsetDateTime createdAt;

	    
	    private List<Task> tasks = new ArrayList<>();
}

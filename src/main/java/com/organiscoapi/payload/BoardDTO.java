package com.organiscoapi.payload;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.springframework.data.annotation.CreatedDate;

import com.organiscoapi.entity.Label;
import com.organiscoapi.entity.ListEntity;
import com.organiscoapi.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {
	private UUID id;

	private String name;

	private String description;

	private User owner;

	private OffsetDateTime createdAt;

	private Set<User> members = new HashSet<>();

	private List<ListEntity> lists = new ArrayList<>();

	private List<Label> labels = new ArrayList<>();
}

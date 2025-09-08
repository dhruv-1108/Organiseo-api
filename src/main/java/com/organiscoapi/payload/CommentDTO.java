package com.organiscoapi.payload;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.springframework.data.annotation.CreatedDate;

import com.organiscoapi.entity.Label;
import com.organiscoapi.entity.ListEntity;
import com.organiscoapi.entity.Task;
import com.organiscoapi.entity.User;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO {
	private UUID id;

	private Task task;

	private User user;

	private String content;

	private OffsetDateTime createdAt;
}

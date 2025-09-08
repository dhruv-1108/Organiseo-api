package com.organiscoapi.payload;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import com.organiscoapi.entity.Attachment;
import com.organiscoapi.entity.Comment;
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
public class TaskDTO {
	private UUID id;

	private ListEntity list;

	private String title;

	private String description;

	private BigDecimal position;

	private User createdBy;

	private User assignedTo;

	private String status;
	private OffsetDateTime dueDate;

	private OffsetDateTime createdAt;

	private Set<Label> labels = new HashSet<>();

	private List<Comment> comments = new ArrayList<>();

	private List<Attachment> attachments = new ArrayList<>();
}

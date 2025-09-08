package com.organiscoapi.payload;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

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
public class AttachmentDTO {
	private UUID id;

	private Task task;

	private User uploadedBy;

	private String fileUrl;

	private OffsetDateTime uploadedAt;
}

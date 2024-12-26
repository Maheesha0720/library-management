package edu.icet.crm.dto.publisher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PublisherUpdateDto {
    private int publisherId;
    private String publisherName;
}

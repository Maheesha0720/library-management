package edu.icet.crm.service;

import edu.icet.crm.dto.publisher.PublisherDto;
import edu.icet.crm.dto.publisher.PublisherSaveDto;
import edu.icet.crm.dto.publisher.PublisherUpdateDto;

import java.util.List;

public interface PublisherService {

   String addPublisher(PublisherSaveDto publisherSaveDto);

   List<PublisherDto> getAllPublishers();

    String updatePublisher(PublisherUpdateDto publisherUpdateDto);

    String deletePublisher(int id);
}
package org.zerock.springex.sample;


import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@ToString
@Service
@RequiredArgsConstructor
public class SampleService {

  @Qualifier("event")
  private final SampleDAO sampleDAO;


}

package com.tts.WeatherApp.Repository;

import com.tts.WeatherApp.model.ZipCode;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ZipCodeRepo extends PagingAndSortingRepository<ZipCode, Long> {


}

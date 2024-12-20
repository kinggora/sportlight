package com.tms.sportlight.mapper;

import com.tms.sportlight.dto.CommunityListDTO;
import com.tms.sportlight.dto.CommunitySearchDTO;
import com.tms.sportlight.dto.common.PageRequestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommunityMapper {

    List<CommunityListDTO> getListDTOListByCapacity(PageRequestDTO<CommunitySearchDTO> pageRequestDTO);
    List<CommunityListDTO> getListDTOListByDistance(PageRequestDTO<CommunitySearchDTO> pageRequestDTO);

    int getCommunityCount(PageRequestDTO<CommunitySearchDTO> pageRequestDTO);

    //Optional<CommunityDetailDTO> getCommunityDetail(int id);
}

package com.energybot.stationInfor.db.mappers;

import com.energybot.stationInfor.db.po.Station;
import java.util.List;

public interface StationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Station record);

    int insertSelective(Station record);

    Station selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Station record);

    int updateByPrimaryKey(Station record);

    List<Station> selectByStationId(String stationId);
}
package com.energybot.stationInfor.db.dao;

import com.energybot.stationInfor.db.mappers.StationMapper;
import com.energybot.stationInfor.db.po.Station;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class StationDaoImpl implements StationDao {
    @Resource
    private StationMapper stationMapper;

    @Override
    public void inertStation(Station station) {
        return ;
    }

    @Override
    public Station queryStationById(long id) {
        return null;
    }

    @Override
    public void updateStation(Station station) {
        return ;
    }
    @Override
    public List<Station> queryStationByStationId(String stationId){
        return stationMapper.selectByStationId(stationId);
    }
}

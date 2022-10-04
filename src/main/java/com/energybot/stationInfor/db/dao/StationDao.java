package com.energybot.stationInfor.db.dao;

import com.energybot.stationInfor.db.po.Station;

import java.util.List;

public interface StationDao {

    public void inertStation(Station station);

    public Station queryStationById(long id);

    public void updateStation(Station station);

    public List<Station> queryStationByStationId(String id);
}

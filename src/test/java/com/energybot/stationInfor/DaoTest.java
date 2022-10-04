package com.energybot.stationInfor;


import com.energybot.stationInfor.db.dao.StationDao;
import com.energybot.stationInfor.db.po.Station;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class DaoTest {

    @Autowired
    private StationDao stationDao;

    @Test
    void setStationActivityQuery(){

        List<Station> station = stationDao.queryStationByStationId("0");
        System.out.println(station.toString());
        station.stream().forEach(stationActivity -> System.out.println(stationActivity.toString()));

        String result = "[Station{id=1, stationId='0', testTime='1', element='1', value='1', mflag='1', qflag='1', sflag='1', extraValue='1'}]";
        assert station.toString().equals(result) == true;
    }

}
